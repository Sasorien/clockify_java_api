package de.clockify.java.api.objects;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class MembershipDTO
{
    private HourlyRateDTO hourlyRate;
    private MembershipStatus membershipStatus;
    private String membershipType;
    private String target;
    private String userId;

    public MembershipDTO(HourlyRateDTO hourlyRate, MembershipStatus membershipStatus, String membershipType, String target, String userId)
    {
        this.hourlyRate = hourlyRate;
        this.membershipStatus = membershipStatus;
        this.membershipType = membershipType;
        this.target = target;
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "MembershipDTO{" +
                "hourlyRate=" + hourlyRate +
                ", membershipStatus=" + membershipStatus +
                ", membershipType='" + membershipType + '\'' +
                ", target='" + target + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MembershipDTO that = (MembershipDTO) o;
        return Objects.equals(hourlyRate, that.hourlyRate) &&
                membershipStatus == that.membershipStatus &&
                Objects.equals(membershipType, that.membershipType) &&
                Objects.equals(target, that.target) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(hourlyRate, membershipStatus, membershipType, target, userId);
    }

    public HourlyRateDTO getHourlyRate()
    {
        return hourlyRate;
    }

    public void setHourlyRate(HourlyRateDTO hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public MembershipStatus getMembershipStatus()
    {
        return membershipStatus;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus)
    {
        this.membershipStatus = membershipStatus;
    }

    public String getMembershipType()
    {
        return membershipType;
    }

    public void setMembershipType(String membershipType)
    {
        this.membershipType = membershipType;
    }

    public String getTarget()
    {
        return target;
    }

    public void setTarget(String target)
    {
        this.target = target;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }
}
