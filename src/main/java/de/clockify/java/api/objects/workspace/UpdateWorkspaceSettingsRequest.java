package de.clockify.java.api.objects.workspace;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class UpdateWorkspaceSettingsRequest
{
    private String lockedTimeEntries;
    private Boolean projectFavorites;
    private Boolean timeRoundingInReports;
    private Boolean onlyAdminsSeeBillableRates;
    private Boolean onlyAdminsCreateProject;
    private Boolean onlyAdminsSeeDashboard;
    private Boolean defaultBillableProjects;
    private String lockTimeEntries;
    private UpdateRoundRequest round;
    private Boolean projectFavorite;
    private Boolean canSeeTimeSheet;
    private Boolean projectPickerSpecialFilter;
    private Boolean forceProjects;
    private Boolean forceTasks;
    private Boolean forceTags;
    private Boolean forceDescription;
    private Boolean onlyAdminsSeeAllTimeEntries;
    private Boolean onlyAdminsSeePublicProjectsEntries;

    public UpdateWorkspaceSettingsRequest()
    {
    }

    @Override
    public String toString()
    {
        return "UpdateWorkspaceSettingsRequest{" +
                "lockedTimeEntries='" + lockedTimeEntries + '\'' +
                ", projectFavorites=" + projectFavorites +
                ", timeRoundingInReports=" + timeRoundingInReports +
                ", onlyAdminsSeeBillableRates=" + onlyAdminsSeeBillableRates +
                ", onlyAdminsCreateProject=" + onlyAdminsCreateProject +
                ", onlyAdminsSeeDashboard=" + onlyAdminsSeeDashboard +
                ", defaultBillableProjects=" + defaultBillableProjects +
                ", lockTimeEntries='" + lockTimeEntries + '\'' +
                ", round=" + round +
                ", projectFavorite=" + projectFavorite +
                ", canSeeTimeSheet=" + canSeeTimeSheet +
                ", projectPickerSpecialFilter=" + projectPickerSpecialFilter +
                ", forceProjects=" + forceProjects +
                ", forceTasks=" + forceTasks +
                ", forceTags=" + forceTags +
                ", forceDescription=" + forceDescription +
                ", onlyAdminsSeeAllTimeEntries=" + onlyAdminsSeeAllTimeEntries +
                ", onlyAdminsSeePublicProjectsEntries=" + onlyAdminsSeePublicProjectsEntries +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateWorkspaceSettingsRequest that = (UpdateWorkspaceSettingsRequest) o;
        return Objects.equals(lockedTimeEntries, that.lockedTimeEntries) &&
                Objects.equals(projectFavorites, that.projectFavorites) &&
                Objects.equals(timeRoundingInReports, that.timeRoundingInReports) &&
                Objects.equals(onlyAdminsSeeBillableRates, that.onlyAdminsSeeBillableRates) &&
                Objects.equals(onlyAdminsCreateProject, that.onlyAdminsCreateProject) &&
                Objects.equals(onlyAdminsSeeDashboard, that.onlyAdminsSeeDashboard) &&
                Objects.equals(defaultBillableProjects, that.defaultBillableProjects) &&
                Objects.equals(lockTimeEntries, that.lockTimeEntries) &&
                Objects.equals(round, that.round) &&
                Objects.equals(projectFavorite, that.projectFavorite) &&
                Objects.equals(canSeeTimeSheet, that.canSeeTimeSheet) &&
                Objects.equals(projectPickerSpecialFilter, that.projectPickerSpecialFilter) &&
                Objects.equals(forceProjects, that.forceProjects) &&
                Objects.equals(forceTasks, that.forceTasks) &&
                Objects.equals(forceTags, that.forceTags) &&
                Objects.equals(forceDescription, that.forceDescription) &&
                Objects.equals(onlyAdminsSeeAllTimeEntries, that.onlyAdminsSeeAllTimeEntries) &&
                Objects.equals(onlyAdminsSeePublicProjectsEntries, that.onlyAdminsSeePublicProjectsEntries);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(lockedTimeEntries, projectFavorites, timeRoundingInReports, onlyAdminsSeeBillableRates, onlyAdminsCreateProject, onlyAdminsSeeDashboard, defaultBillableProjects, lockTimeEntries, round, projectFavorite, canSeeTimeSheet, projectPickerSpecialFilter, forceProjects, forceTasks, forceTags, forceDescription, onlyAdminsSeeAllTimeEntries, onlyAdminsSeePublicProjectsEntries);
    }

    public String getLockedTimeEntries()
    {
        return lockedTimeEntries;
    }

    public void setLockedTimeEntries(String lockedTimeEntries)
    {
        this.lockedTimeEntries = lockedTimeEntries;
    }

    public Boolean getProjectFavorites()
    {
        return projectFavorites;
    }

    public void setProjectFavorites(Boolean projectFavorites)
    {
        this.projectFavorites = projectFavorites;
    }

    public Boolean getTimeRoundingInReports()
    {
        return timeRoundingInReports;
    }

    public void setTimeRoundingInReports(Boolean timeRoundingInReports)
    {
        this.timeRoundingInReports = timeRoundingInReports;
    }

    public Boolean getOnlyAdminsSeeBillableRates()
    {
        return onlyAdminsSeeBillableRates;
    }

    public void setOnlyAdminsSeeBillableRates(Boolean onlyAdminsSeeBillableRates)
    {
        this.onlyAdminsSeeBillableRates = onlyAdminsSeeBillableRates;
    }

    public Boolean getOnlyAdminsCreateProject()
    {
        return onlyAdminsCreateProject;
    }

    public void setOnlyAdminsCreateProject(Boolean onlyAdminsCreateProject)
    {
        this.onlyAdminsCreateProject = onlyAdminsCreateProject;
    }

    public Boolean getOnlyAdminsSeeDashboard()
    {
        return onlyAdminsSeeDashboard;
    }

    public void setOnlyAdminsSeeDashboard(Boolean onlyAdminsSeeDashboard)
    {
        this.onlyAdminsSeeDashboard = onlyAdminsSeeDashboard;
    }

    public Boolean getDefaultBillableProjects()
    {
        return defaultBillableProjects;
    }

    public void setDefaultBillableProjects(Boolean defaultBillableProjects)
    {
        this.defaultBillableProjects = defaultBillableProjects;
    }

    public String getLockTimeEntries()
    {
        return lockTimeEntries;
    }

    public void setLockTimeEntries(String lockTimeEntries)
    {
        this.lockTimeEntries = lockTimeEntries;
    }

    public UpdateRoundRequest getRound()
    {
        return round;
    }

    public void setRound(UpdateRoundRequest round)
    {
        this.round = round;
    }

    public Boolean getProjectFavorite()
    {
        return projectFavorite;
    }

    public void setProjectFavorite(Boolean projectFavorite)
    {
        this.projectFavorite = projectFavorite;
    }

    public Boolean getCanSeeTimeSheet()
    {
        return canSeeTimeSheet;
    }

    public void setCanSeeTimeSheet(Boolean canSeeTimeSheet)
    {
        this.canSeeTimeSheet = canSeeTimeSheet;
    }

    public Boolean getProjectPickerSpecialFilter()
    {
        return projectPickerSpecialFilter;
    }

    public void setProjectPickerSpecialFilter(Boolean projectPickerSpecialFilter)
    {
        this.projectPickerSpecialFilter = projectPickerSpecialFilter;
    }

    public Boolean getForceProjects()
    {
        return forceProjects;
    }

    public void setForceProjects(Boolean forceProjects)
    {
        this.forceProjects = forceProjects;
    }

    public Boolean getForceTasks()
    {
        return forceTasks;
    }

    public void setForceTasks(Boolean forceTasks)
    {
        this.forceTasks = forceTasks;
    }

    public Boolean getForceTags()
    {
        return forceTags;
    }

    public void setForceTags(Boolean forceTags)
    {
        this.forceTags = forceTags;
    }

    public Boolean getForceDescription()
    {
        return forceDescription;
    }

    public void setForceDescription(Boolean forceDescription)
    {
        this.forceDescription = forceDescription;
    }

    public Boolean getOnlyAdminsSeeAllTimeEntries()
    {
        return onlyAdminsSeeAllTimeEntries;
    }

    public void setOnlyAdminsSeeAllTimeEntries(Boolean onlyAdminsSeeAllTimeEntries)
    {
        this.onlyAdminsSeeAllTimeEntries = onlyAdminsSeeAllTimeEntries;
    }

    public Boolean getOnlyAdminsSeePublicProjectsEntries()
    {
        return onlyAdminsSeePublicProjectsEntries;
    }

    public void setOnlyAdminsSeePublicProjectsEntries(Boolean onlyAdminsSeePublicProjectsEntries)
    {
        this.onlyAdminsSeePublicProjectsEntries = onlyAdminsSeePublicProjectsEntries;
    }
}
