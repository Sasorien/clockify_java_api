package de.clockify.java.api.objects.workspace;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 15.11.2018
 *
 * @author jemueller
 */
public class Round
{
    private String minutes;
    private String round;

    public Round(String minutes, String round)
    {
        this.minutes = minutes;
        this.round = round;
    }

    @Override
    public String toString()
    {
        return "Round{" +
                "minutes='" + minutes + '\'' +
                ", round='" + round + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round1 = (Round) o;
        return Objects.equals(minutes, round1.minutes) &&
                Objects.equals(round, round1.round);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(minutes, round);
    }

    public String getMinutes()
    {
        return minutes;
    }

    public void setMinutes(String minutes)
    {
        this.minutes = minutes;
    }

    public String getRound()
    {
        return round;
    }

    public void setRound(String round)
    {
        this.round = round;
    }
}
