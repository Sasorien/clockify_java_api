package de.clockify.java.api.objects.workspace;

import java.util.Objects;

/**
 * Created by Jan Eric Müller (aka Saso) on 19.11.2018
 *
 * @author jemueller
 */
public class CreateWorkspaceRequest
{
    private String name;

    public CreateWorkspaceRequest(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "CreateWorkspaceRequest{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateWorkspaceRequest that = (CreateWorkspaceRequest) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
