/**
 * Copyright Apr 22, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Manav Darji
 */
package in.co.sandbox.api.client.gst;

import java.io.IOException;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.beans.ApiResponse;
import in.co.sandbox.api.client.RestClient;
import in.co.sandbox.api.exception.SandboxException;
import in.co.sandbox.api.types.ENDPOINTS;

// TODO: Auto-generated Javadoc
/**
 * The Class GSTClient.
 */
public class GSTClient extends RestClient
{

	/**
	 * Instantiates a new GST client.
	 *
	 * @param sessionCredentials the session credentials
	 * @param enableDebugLog the enable debug log
	 */
	public GSTClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		super(sessionCredentials, enableDebugLog);
	}

	/**
	 * Track GST return.
	 *
	 * @param gstin the gstin
	 * @param financialYear the financial year
	 * @return the api response
	 * @throws SandboxException the sandbox exception
	 */
	public ApiResponse trackGSTReturn(final String gstin, final String financialYear) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.TRACK_GST_RETURN, gstin, financialYear));
			return response;
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

	/**
	 * Search gstin.
	 *
	 * @param gstin the gstin
	 * @return the api response
	 * @throws SandboxException the sandbox exception
	 */
	public ApiResponse searchGstin(final String gstin) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.SEARCH_GSTIN, gstin));
			return response;
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

	/**
	 * Search gstin by pan.
	 *
	 * @param pan the pan
	 * @return the api response
	 * @throws SandboxException the sandbox exception
	 */
	public ApiResponse searchGstinByPan(final String pan) throws SandboxException
	{

		try
		{
			ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.SEARCH_GSTIN_BY_PAN, pan));
			return response;
		}
		catch (final IOException e)
		{
			throw new SandboxException("Internal Server Error", 500);
		}

	}

}
