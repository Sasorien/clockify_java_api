package de.clockify.java.api.backend;

import java.util.List;
import java.util.Objects;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.clockify.java.api.ClockifyJavaAPI;
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
            List<WorkspaceDTO> topics = response.readEntity(List.class);

            log.debug("Retrieved workspace dtos: {}", topics.size());
            log.trace("Retrieved workspace dtos: {}", topics);
            return topics;
        }

        throw new RuntimeException("Error " + response.getStatus() + " in ReST: " + response.readEntity(String.class));
    }

    @Override
    public WorkspaceDTO addNewWorkspace(String name)
    {
        throw new UnsupportedOperationException("Not implemented yet!");
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
