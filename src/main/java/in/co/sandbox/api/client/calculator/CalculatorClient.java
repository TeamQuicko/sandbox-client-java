/**
 * Copyright Apr 22, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Manav Darji
 */
package in.co.sandbox.api.client.calculator;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.client.calculator.gst.GSTCalculatorClient;
import in.co.sandbox.api.client.calculator.roc.ROCCalculatorClient;
import in.co.sandbox.api.client.calculator.tds.TDSCalculatorClient;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculatorClient.
 */
public class CalculatorClient
{

	/** The roc. */
	public ROCCalculatorClient ROC;

	/** The tds. */
	public TDSCalculatorClient TDS;

	public GSTCalculatorClient GST;

	/**
	 * Instantiates a new calculator client.
	 *
	 * @param sessionCredentials
	 *            the session credentials
	 * @param enableDebugLog
	 *            the enable debug log
	 */
	public CalculatorClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		this.ROC = new ROCCalculatorClient(sessionCredentials, enableDebugLog);

		this.TDS = new TDSCalculatorClient(sessionCredentials, enableDebugLog);

		this.GST = new GSTCalculatorClient(sessionCredentials, enableDebugLog);
	}

}
