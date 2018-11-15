package de.clockify.java.api.backend;

import java.util.List;

import de.clockify.java.api.objects.workspace.UpdateWorkspaceRequest;
import de.clockify.java.api.objects.workspace.WorkspaceDTO;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class ReSTBackend implements ClockifyBackend
{
    @Override
    public List<WorkspaceDTO> getAllWorkspacesForUser()
    {
        throw new UnsupportedOperationException("Not implemented yet!");
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
}
