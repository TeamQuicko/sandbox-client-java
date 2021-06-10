/**
 * Copyright Jun 10, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Harsh Bagadia
 */
package in.co.sandbox.api.client.gst.gsp;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.beans.ApiResponse;
import in.co.sandbox.api.client.RestClient;
import in.co.sandbox.api.exception.SandboxException;
import in.co.sandbox.api.types.ENDPOINTS;

// TODO: Auto-generated Javadoc
/**
 * The Class PublicClient.
 */
public class PublicClient extends RestClient
{

	/**
	 * Instantiates a new public client.
	 *
	 * @param sessionCredentials
	 *            the session credentials
	 * @param enableDebugLog
	 *            the enable debug log
	 */
	public PublicClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		super(sessionCredentials, enableDebugLog);
	}

	/**
	 * Track GST return.
	 *
	 * @param gstin
	 *            the gstin
	 * @param financialYear
	 *            the financial year
	 * @return the api response
	 * @throws SandboxException
	 *             the sandbox exception
	 */
	public JSONObject trackGSTReturn(final String gstin, final String financialYear) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.TRACK_GST_RETURN, gstin, financialYear));
			return response.get("data");
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

	/**
	 * Search gstin.
	 *
	 * @param gstin
	 *            the gstin
	 * @return the api response
	 * @throws SandboxException
	 *             the sandbox exception
	 */
	public JSONObject searchGstin(final String gstin) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.SEARCH_GSTIN, gstin));
			return response.get("data");
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

	/**
	 * Search gstin by pan.
	 *
	 * @param pan
	 *            the pan
	 * @return the api response
	 * @throws SandboxException
	 *             the sandbox exception
	 */
	public JSONArray searchGstinByPan(final String pan, final String stateCode) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.SEARCH_GSTIN_BY_PAN, pan, stateCode));
			return response.get("data");
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

}
