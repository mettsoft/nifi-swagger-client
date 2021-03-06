/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.3.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.RemoteProcessGroupEntity;
import com.github.hermannpencole.nifi.swagger.client.model.RemoteProcessGroupPortEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RemoteProcessGroupsApi
 */
@Ignore
public class RemoteProcessGroupsApiTest {

    private final RemoteProcessGroupsApi api = new RemoteProcessGroupsApi();

    
    /**
     * Gets a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRemoteProcessGroupTest() throws ApiException {
        String id = null;
        RemoteProcessGroupEntity response = api.getRemoteProcessGroup(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeRemoteProcessGroupTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        RemoteProcessGroupEntity response = api.removeRemoteProcessGroup(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates a remote process group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupTest() throws ApiException {
        String id = null;
        RemoteProcessGroupEntity body = null;
        RemoteProcessGroupEntity response = api.updateRemoteProcessGroup(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupInputPortTest() throws ApiException {
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity body = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupInputPort(id, portId, body);

        // TODO: test validations
    }
    
    /**
     * Updates a remote port
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRemoteProcessGroupOutputPortTest() throws ApiException {
        String id = null;
        String portId = null;
        RemoteProcessGroupPortEntity body = null;
        RemoteProcessGroupPortEntity response = api.updateRemoteProcessGroupOutputPort(id, portId, body);

        // TODO: test validations
    }
    
}
