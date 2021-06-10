/**
 * Copyright Jun 10, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Harsh Bagadia
 */
package in.co.sandbox.api.client.gst;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.client.RestClient;

// TODO: Auto-generated Javadoc
/**
 * The Class GSTClient.
 */
public class GSTClient extends RestClient
{

	/** The gsp. */
	public GSPClient GSP;

	/**
	 * Instantiates a new GST client.
	 *
	 * @param apiSessionCredentials
	 *            the api session credentials
	 * @param enableDebugLog
	 *            the enable debug log
	 */
	public GSTClient(final ApiSessionCredentials apiSessionCredentials, final boolean enableDebugLog)
	{
		super(apiSessionCredentials, enableDebugLog);

		this.GSP = new GSPClient(apiSessionCredentials, enableDebugLog);

	}

}
