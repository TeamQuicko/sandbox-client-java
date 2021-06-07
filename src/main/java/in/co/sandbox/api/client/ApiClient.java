/**
 * Copyright Apr 22, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Harsh Bagadia
 */
package in.co.sandbox.api.client;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.client.bank.BankClient;
import in.co.sandbox.api.client.calculator.CalculatorClient;
import in.co.sandbox.api.client.gst.GSTClient;
import in.co.sandbox.api.client.pan.PANClient;

// TODO: Auto-generated Javadoc
/**
 * The Class ApiClient.
 */
public class ApiClient
{

	/** The pan. */
	public PANClient PAN;

	/** The bank. */
	public BankClient BANK;

	/** The Calculator. */
	public CalculatorClient Calculator;
	
	/** The gst. */
	public GSTClient GST;

	/**
	 * Instantiates a new api client.
	 *
	 * @param sessionCredentials
	 *            the session credentials
	 * @param enableDebugLog
	 *            enable debug log flag
	 */
	protected ApiClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{

		this.PAN = new PANClient(sessionCredentials, enableDebugLog);

		this.BANK = new BankClient(sessionCredentials, enableDebugLog);

		this.Calculator = new CalculatorClient(sessionCredentials, enableDebugLog);
		
		this.GST = new GSTClient(sessionCredentials, enableDebugLog);

	}

}
