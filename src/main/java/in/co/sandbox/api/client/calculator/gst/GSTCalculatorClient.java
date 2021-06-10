/**
 * Copyright Apr 29, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Krutarth Trivedi
 */
package in.co.sandbox.api.client.calculator.gst;

import java.io.IOException;

import org.json.JSONObject;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.beans.ApiResponse;
import in.co.sandbox.api.client.RestClient;
import in.co.sandbox.api.exception.SandboxException;
import in.co.sandbox.api.types.ENDPOINTS;

// TODO: Auto-generated Javadoc
/**
 * The Class GSTClient.
 */
public class GSTCalculatorClient extends RestClient
{

	/**
	 * Instantiates a new GST client.
	 *
	 * @param sessionCredentials
	 *            the session credentials
	 * @param enableDebugLog
	 *            the enable debug log
	 */
	public GSTCalculatorClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		super(sessionCredentials, enableDebugLog);
	}

	/**
	 * GST HSN Lookup.
	 *
	 * @param key
	 * @return the api response
	 * @throws SandboxException
	 *             the sandbox exception
	 */
	public JSONObject getItemDetails(final String key) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.GST_ITEM_CODE_LOOKUP, key));
			return response.get("data");
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

}
