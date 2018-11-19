package de.clockify.java.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.HttpUrlConnectorProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class ClockifyJavaAPI
{
    public static final String API_KEY = "TODO";

    private static final Logger log = LoggerFactory.getLogger(ClockifyJavaAPI.class);

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }

    public static Client createClient()
{
    JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
    provider.setMapper(
            new ObjectMapper()
                    .registerModule(new JavaTimeModule())
                    .registerModule(new Jdk8Module())
                    .enable(SerializationFeature.INDENT_OUTPUT)
                    .disable(MapperFeature.USE_GETTERS_AS_SETTERS)
                    .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                    .configure(JsonParser.Feature.ALLOW_COMMENTS, true)
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    );

    ClientConfig config = new ClientConfig();
    config.register(provider, MessageBodyReader.class, MessageBodyWriter.class);
    config.property(HttpUrlConnectorProvider.SET_METHOD_WORKAROUND, true);

    return ClientBuilder.newClient(config);
}
}
