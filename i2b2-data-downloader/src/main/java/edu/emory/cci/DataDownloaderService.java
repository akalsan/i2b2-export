package edu.emory.cci;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/DataDownloader")
public final class DataDownloaderService {
    /**
     * Fetches the requested data from i2b2 and sends an output file back to the
     * client formatted according to the configuration given in the XML.
     * 
     * @param xml
     *            Contains all required parameters to complete the request,
     *            including i2b2 username and authentication token, i2b2 patient
     *            set to query, and the output format configuration.
     * @return either the formatted output as a CSV file or a status code
     *         indicating an error
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/downloadData")
    public Response generateOutput(String xml) {
        return Response.status(200).build();
    }

    /**
     * Saves the output configuration as specified in the given XML.
     * 
     * @param xml
     *            Contains all required parameters to complete the save
     *            operation, including i2b2 username and authentication token,
     *            the output configuration, and its name.
     * @return a status code indicating success or failure
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_XML)
    @Path("/saveConfig")
    public Response saveConfiguration(String xml) {
        return Response.status(200).build();
    }

    /**
     * Loads the output configuration with the name given n the specified XML.
     * 
     * @param xml
     *            Contains all required parameters to complete the load
     *            operation, including i2b2 username and authentication token,
     *            and the name of the output configuration to load.
     * @return the output configuration or a status code indicating failure
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_XML)
    @Path("/loadConfig")
    public Response loadConfiguration(String xml) {
        return Response.status(200).build();
    }
}
