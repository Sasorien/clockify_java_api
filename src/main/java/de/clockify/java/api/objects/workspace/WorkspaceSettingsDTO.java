package de.clockify.java.api.objects.workspace;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class WorkspaceSettingsDTO
{
    private Boolean canSeeTimeSheet;
    private Boolean defaultBillableProjects;
    private Boolean forceDescription;
    private Boolean forceProjects;
    private Boolean forceTags;
    private Boolean forceTasks;
    private String lockTimeEntries;
    private Boolean onlyAdminsCreateProject;
    private Boolean onlyAdminsSeeAllTimeEntries;
    private Boolean onlyAdminsSeeBillableRates;
    private Boolean onlyAdminsSeeDashboard;
    private Boolean onlyAdminsSeePublicProjectsEntries;
    private Boolean projectFavorites;
    private Boolean projectPickerSpecialFilter;
    private Round round;
    private Boolean timeRoundingInReports;

    public WorkspaceSettingsDTO()
    {
        this.canSeeTimeSheet = false;
        this.defaultBillableProjects = true;
        this.forceDescription = false;
        this.forceProjects = false;
        this.forceTags = false;
        this.forceTasks = false;
        this.lockTimeEntries = "";
        this.onlyAdminsCreateProject = false;
        this.onlyAdminsSeeAllTimeEntries = true;
        this.onlyAdminsSeeBillableRates = false;
        this.onlyAdminsSeeDashboard = false;
        this.onlyAdminsSeePublicProjectsEntries = false;
        this.projectFavorites = null;
        this.projectPickerSpecialFilter = null;
        this.round = new Round("15", "Round up to");
        this.timeRoundingInReports = false;
    }

    @Override
    public String toString()
    {
        return "WorkspaceSettingsDTO{" +
                "canSeeTimeSheet=" + canSeeTimeSheet +
                ", defaultBillableProjects=" + defaultBillableProjects +
                ", forceDescription=" + forceDescription +
                ", forceProjects=" + forceProjects +
                ", forceTags=" + forceTags +
                ", forceTasks=" + forceTasks +
                ", lockTimeEntries='" + lockTimeEntries + '\'' +
                ", onlyAdminsCreateProject=" + onlyAdminsCreateProject +
                ", onlyAdminsSeeAllTimeEntries=" + onlyAdminsSeeAllTimeEntries +
                ", onlyAdminsSeeBillableRates=" + onlyAdminsSeeBillableRates +
                ", onlyAdminsSeeDashboard=" + onlyAdminsSeeDashboard +
                ", onlyAdminsSeePublicProjectsEntries=" + onlyAdminsSeePublicProjectsEntries +
                ", projectFavorites=" + projectFavorites +
                ", projectPickerSpecialFilter=" + projectPickerSpecialFilter +
                ", round=" + round +
                ", timeRoundingInReports=" + timeRoundingInReports +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkspaceSettingsDTO that = (WorkspaceSettingsDTO) o;
        return Objects.equals(canSeeTimeSheet, that.canSeeTimeSheet) &&
                Objects.equals(defaultBillableProjects, that.defaultBillableProjects) &&
                Objects.equals(forceDescription, that.forceDescription) &&
                Objects.equals(forceProjects, that.forceProjects) &&
                Objects.equals(forceTags, that.forceTags) &&
                Objects.equals(forceTasks, that.forceTasks) &&
                Objects.equals(lockTimeEntries, that.lockTimeEntries) &&
                Objects.equals(onlyAdminsCreateProject, that.onlyAdminsCreateProject) &&
                Objects.equals(onlyAdminsSeeAllTimeEntries, that.onlyAdminsSeeAllTimeEntries) &&
                Objects.equals(onlyAdminsSeeBillableRates, that.onlyAdminsSeeBillableRates) &&
                Objects.equals(onlyAdminsSeeDashboard, that.onlyAdminsSeeDashboard) &&
                Objects.equals(onlyAdminsSeePublicProjectsEntries, that.onlyAdminsSeePublicProjectsEntries) &&
                Objects.equals(projectFavorites, that.projectFavorites) &&
                Objects.equals(projectPickerSpecialFilter, that.projectPickerSpecialFilter) &&
                Objects.equals(round, that.round) &&
                Objects.equals(timeRoundingInReports, that.timeRoundingInReports);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(canSeeTimeSheet, defaultBillableProjects, forceDescription, forceProjects, forceTags, forceTasks, lockTimeEntries, onlyAdminsCreateProject, onlyAdminsSeeAllTimeEntries, onlyAdminsSeeBillableRates, onlyAdminsSeeDashboard, onlyAdminsSeePublicProjectsEntries, projectFavorites, projectPickerSpecialFilter, round, timeRoundingInReports);
    }

    public Boolean getCanSeeTimeSheet()
    {
        return canSeeTimeSheet;
    }

    public void setCanSeeTimeSheet(Boolean canSeeTimeSheet)
    {
        this.canSeeTimeSheet = canSeeTimeSheet;
    }

    public Boolean getDefaultBillableProjects()
    {
        return defaultBillableProjects;
    }

    public void setDefaultBillableProjects(Boolean defaultBillableProjects)
    {
        this.defaultBillableProjects = defaultBillableProjects;
    }

    public Boolean getForceDescription()
    {
        return forceDescription;
    }

    public void setForceDescription(Boolean forceDescription)
    {
        this.forceDescription = forceDescription;
    }

    public Boolean getForceProjects()
    {
        return forceProjects;
    }

    public void setForceProjects(Boolean forceProjects)
    {
        this.forceProjects = forceProjects;
    }

    public Boolean getForceTags()
    {
        return forceTags;
    }

    public void setForceTags(Boolean forceTags)
    {
        this.forceTags = forceTags;
    }

    public Boolean getForceTasks()
    {
        return forceTasks;
    }

    public void setForceTasks(Boolean forceTasks)
    {
        this.forceTasks = forceTasks;
    }

    public String getLockTimeEntries()
    {
        return lockTimeEntries;
    }

    public void setLockTimeEntries(String lockTimeEntries)
    {
        this.lockTimeEntries = lockTimeEntries;
    }

    public Boolean getOnlyAdminsCreateProject()
    {
        return onlyAdminsCreateProject;
    }

    public void setOnlyAdminsCreateProject(Boolean onlyAdminsCreateProject)
    {
        this.onlyAdminsCreateProject = onlyAdminsCreateProject;
    }

    public Boolean getOnlyAdminsSeeAllTimeEntries()
    {
        return onlyAdminsSeeAllTimeEntries;
    }

    public void setOnlyAdminsSeeAllTimeEntries(Boolean onlyAdminsSeeAllTimeEntries)
    {
        this.onlyAdminsSeeAllTimeEntries = onlyAdminsSeeAllTimeEntries;
    }

    public Boolean getOnlyAdminsSeeBillableRates()
    {
        return onlyAdminsSeeBillableRates;
    }

    public void setOnlyAdminsSeeBillableRates(Boolean onlyAdminsSeeBillableRates)
    {
        this.onlyAdminsSeeBillableRates = onlyAdminsSeeBillableRates;
    }

    public Boolean getOnlyAdminsSeeDashboard()
    {
        return onlyAdminsSeeDashboard;
    }

    public void setOnlyAdminsSeeDashboard(Boolean onlyAdminsSeeDashboard)
    {
        this.onlyAdminsSeeDashboard = onlyAdminsSeeDashboard;
    }

    public Boolean getOnlyAdminsSeePublicProjectsEntries()
    {
        return onlyAdminsSeePublicProjectsEntries;
    }

    public void setOnlyAdminsSeePublicProjectsEntries(Boolean onlyAdminsSeePublicProjectsEntries)
    {
        this.onlyAdminsSeePublicProjectsEntries = onlyAdminsSeePublicProjectsEntries;
    }

    public Boolean getProjectFavorites()
    {
        return projectFavorites;
    }

    public void setProjectFavorites(Boolean projectFavorites)
    {
        this.projectFavorites = projectFavorites;
    }

    public Boolean getProjectPickerSpecialFilter()
    {
        return projectPickerSpecialFilter;
    }

    public void setProjectPickerSpecialFilter(Boolean projectPickerSpecialFilter)
    {
        this.projectPickerSpecialFilter = projectPickerSpecialFilter;
    }

    public Round getRound()
    {
        return round;
    }

    public void setRound(Round round)
    {
        this.round = round;
    }

    public Boolean getTimeRoundingInReports()
    {
        return timeRoundingInReports;
    }

    public void setTimeRoundingInReports(Boolean timeRoundingInReports)
    {
        this.timeRoundingInReports = timeRoundingInReports;
    }
}
