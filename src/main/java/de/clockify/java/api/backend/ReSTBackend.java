package de.clockify.java.api.backend;

import java.util.List;
import java.util.Objects;

import javax.ws.rs.ForbiddenException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.clockify.java.api.ClockifyJavaAPI;
import de.clockify.java.api.objects.workspace.CreateWorkspaceRequest;
import de.clockify.java.api.objects.workspace.UpdateWorkspaceRequest;
import de.clockify.java.api.objects.workspace.WorkspaceDTO;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class ReSTBackend implements ClockifyBackend
{
    private Client client;
    private static final Logger log = LoggerFactory.getLogger(ReSTBackend.class);

    public ReSTBackend(Client client)
    {
        this.client = Objects.requireNonNull(client);
    }

    @Override
    public List<WorkspaceDTO> getAllWorkspacesForUser()
    {
        log.debug("Retrieve all workspaces from clockify for this user...");

        Response response = client.target(getBackendURL()) //
                .path("workspaces") //
                .request() //
                .header("X-Api-Key", ClockifyJavaAPI.API_KEY)
                .get();

        log.trace("Response status: {}", response.getStatus());

        if (response != null && response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL))
        {
            List<WorkspaceDTO> workspaces = response.readEntity(List.class);

            log.debug("Retrieved workspace dtos: {}", workspaces.size());
            log.trace("Retrieved workspace dtos: {}", workspaces);
            return workspaces;
        }
        if (response != null && response.getStatus() == 401) //Unauthorized
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new NotAuthorizedException("Wrong X-Api-Key handed!");
        }
        if (response != null && response.getStatus() == 403) //Forbidden
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new ForbiddenException("Missing permimssions for current action!");
        }
        if (response != null && response.getStatus() == 404) //Not Found
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new NotFoundException("Resource could not be found!");
        }
        if (response != null) //Else
        {
            log.error("Unhandled Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new RuntimeException("Unhandled Error " + response.getStatus() + " in ReST call: " + response.readEntity(String.class));
        }

        log.error("Unhandled Error in ReST call.");
        throw new RuntimeException("Unhandled Error in ReST call.");
    }

    @Override
    public WorkspaceDTO addNewWorkspace(String name)
    {
        log.debug("Create new workspace '{}'...", name);

        CreateWorkspaceRequest requestObject = new CreateWorkspaceRequest(name);

        Response response = client.target(getBackendURL()) //
                .path("workspaces") //
                .request() //
                .header("X-Api-Key", ClockifyJavaAPI.API_KEY)
                .post(Entity.json(requestObject));

        log.trace("Response status: {}", response.getStatus());

        if (response != null && response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL))
        {
            WorkspaceDTO workspace = response.readEntity(WorkspaceDTO.class);

            log.trace("Workspace created: {}", workspace);
            return workspace;
        }
        if (response != null && response.getStatus() == 401) //Unauthorized
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new NotAuthorizedException("Wrong X-Api-Key handed!");
        }
        if (response != null && response.getStatus() == 403) //Forbidden
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new ForbiddenException("Missing permimssions for current action!");
        }
        if (response != null && response.getStatus() == 404) //Not Found
        {
            log.error("Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new NotFoundException("Resource could not be found!");
        }
        if (response != null) //Else
        {
            log.error("Unhandled Error {} in ReST call: {}", response.getStatus(), response.readEntity(String.class));
            throw new RuntimeException("Unhandled Error " + response.getStatus() + " in ReST call: " + response.readEntity(String.class));
        }

        log.error("Unhandled Error in ReST call.");
        throw new RuntimeException("Unhandled Error in ReST call.");
    }

    @Override
    public WorkspaceDTO findWorkspaceById(String id)
    {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public WorkspaceDTO updateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest)
    {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public WorkspaceDTO leaveWorkspace(Integer workspaceId)
    {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    private String getBackendURL()
    {
        return "TODO";
    }
}
