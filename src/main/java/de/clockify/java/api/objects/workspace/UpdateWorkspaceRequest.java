package de.clockify.java.api.objects.workspace;

import java.util.List;
import java.util.Objects;

import de.clockify.java.api.objects.HourlyRateDTO;
import de.clockify.java.api.objects.MembershipDTO;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class UpdateWorkspaceRequest
{
    private HourlyRateDTO hourlyRate;
    private String id;
    private String imageUrl;
    private List<MembershipDTO> memberships;
    private String name;
    private WorkspaceSettingsDTO workspaceSettings;

    public UpdateWorkspaceRequest(HourlyRateDTO hourlyRate, String id, String imageUrl, List<MembershipDTO> memberships, String name, WorkspaceSettingsDTO workspaceSettings)
    {
        this.hourlyRate = hourlyRate;
        this.id = id;
        this.imageUrl = imageUrl;
        this.memberships = memberships;
        this.name = name;
        this.workspaceSettings = workspaceSettings;
    }

    @Override
    public String toString()
    {
        return "WorkspaceDTO{" +
                "hourlyRate=" + hourlyRate +
                ", id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", memberships=" + memberships +
                ", name='" + name + '\'' +
                ", workspaceSettings=" + workspaceSettings +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateWorkspaceRequest that = (UpdateWorkspaceRequest) o;
        return Objects.equals(hourlyRate, that.hourlyRate) &&
                Objects.equals(id, that.id) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(memberships, that.memberships) &&
                Objects.equals(name, that.name) &&
                Objects.equals(workspaceSettings, that.workspaceSettings);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(hourlyRate, id, imageUrl, memberships, name, workspaceSettings);
    }

    public HourlyRateDTO getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(HourlyRateDTO hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public List<MembershipDTO> getMemberships()
    {
        return memberships;
    }

    public void setMemberships(List<MembershipDTO> memberships)
    {
        this.memberships = memberships;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public WorkspaceSettingsDTO getWorkspaceSettings()
    {
        return workspaceSettings;
    }

    public void setWorkspaceSettings(WorkspaceSettingsDTO workspaceSettings)
    {
        this.workspaceSettings = workspaceSettings;
    }
}
