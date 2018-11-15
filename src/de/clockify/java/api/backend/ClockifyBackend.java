package de.clockify.java.api.backend;

import java.util.List;

import de.clockify.java.api.objects.workspace.UpdateWorkspaceRequest;
import de.clockify.java.api.objects.workspace.WorkspaceDTO;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public interface ClockifyBackend
{
    public List<WorkspaceDTO> getAllWorkspacesForUser();

    public WorkspaceDTO addNewWorkspace(String name);

    public WorkspaceDTO findWorkspaceById(String id);

    public WorkspaceDTO updateWorkspace(UpdateWorkspaceRequest updateWorkspaceRequest);

    public WorkspaceDTO leaveWorkspace(Integer workspaceId);
}
