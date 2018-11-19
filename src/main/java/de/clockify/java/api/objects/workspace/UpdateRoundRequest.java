package de.clockify.java.api.objects.workspace;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class UpdateRoundRequest
{
    private String round;
    private String minutes;

    public UpdateRoundRequest(String minutes, String round)
    {
        this.round = round;
        this.minutes = minutes;
    }

    @Override
    public String toString()
    {
        return "Round{" +
                "round='" + round + '\'' +
                ", minutes='" + minutes + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateRoundRequest round1 = (UpdateRoundRequest) o;
        return Objects.equals(round, round1.round) &&
                Objects.equals(minutes, round1.minutes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutes, round);
    }

    public String getRound()
    {
        return round;
    }

    public void setRound(String round)
    {
        this.round = round;
    }

    public String getMinutes()
    {
        return minutes;
    }

    public void setMinutes(String minutes)
    {
        this.minutes = minutes;
    }
}
