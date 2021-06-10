/**
 * Copyright Jun 5, 2020, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Harsh Bagadia
 */
package in.co.sandbox.api.client.gst;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.client.RestClient;
import in.co.sandbox.api.client.gst.gsp.PublicClient;

// TODO: Auto-generated Javadoc
/**
 * The Class GSPClient.
 */
public class GSPClient extends RestClient
{

	/** The public. */
	public PublicClient PUBLIC;

	/**
	 * Instantiates a new GSP client.
	 *
	 * @param sessionCredentials
	 *            the session credentials
	 */
	public GSPClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		super(sessionCredentials);

		this.PUBLIC = new PublicClient(sessionCredentials, enableDebugLog);

	}

}
