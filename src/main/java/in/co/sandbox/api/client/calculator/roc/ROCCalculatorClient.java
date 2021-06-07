/**
 * Copyright Apr 22, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Krutarth Trivedi
 */
package in.co.sandbox.api.client.calculator.roc;

import java.io.IOException;
import java.math.BigDecimal;

import in.co.sandbox.api.auth.ApiSessionCredentials;
import in.co.sandbox.api.beans.ApiResponse;
import in.co.sandbox.api.client.RestClient;
import in.co.sandbox.api.exception.SandboxException;
import in.co.sandbox.api.types.ENDPOINTS;

// TODO: Auto-generated Javadoc
/**
 * The Class ROCCalculatorClient.
 */
public class ROCCalculatorClient extends RestClient
{

	/**
	 * Instantiates a new ROC calculator client.
	 *
	 * @param sessionCredentials the session credentials
	 * @param enableDebugLog the enable debug log
	 */
	public ROCCalculatorClient(final ApiSessionCredentials sessionCredentials, final boolean enableDebugLog)
	{
		super(sessionCredentials, enableDebugLog);

	}

	/**
	 * Calculate company registration cost.
	 *
	 * @param incorporation_class the incorporation class
	 * @param state the state
	 * @param directors the directors
	 * @param share_capital the share capital
	 * @return the api response
	 * @throws SandboxException the sandbox exception
	 */
	public ApiResponse calculateCompanyRegistrationCost(final String incorporation_class, final String state,
	        final Integer directors, final BigDecimal share_capital) throws SandboxException
	{

		if (incorporation_class != null && state != null && directors != null && share_capital != null)
		{

			try
			{

				ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.CALCULATE_COMPANY_REGISTRATION_COST,
				        incorporation_class, state, directors, share_capital));

				return response;

			}
			catch (final IOException e)
			{
				throw new SandboxException("Internal Server Error", 500);
			}
		}
		else
		{
			throw new SandboxException("Missing required parameters", 400);
		}
	}

	/**
	 * Calculate partnership registration cost.
	 *
	 * @param incorporation_class the incorporation class
	 * @param state the state
	 * @param partners the partners
	 * @param contribution the contribution
	 * @return the api response
	 * @throws SandboxException the sandbox exception
	 */
	public ApiResponse calculatePartnershipRegistrationCost(final String incorporation_class, final String state,
	        final Integer partners, final BigDecimal contribution) throws SandboxException
	{

		if (incorporation_class != null && state != null && partners != null && contribution != null)
		{

			try
			{

				ApiResponse response = super.get(ENDPOINTS.build(ENDPOINTS.URL.CALCULATE_PARTNERSHIP_REGISTRATION_COST,
				        incorporation_class, state, partners, contribution));

				return response;

			}
			catch (final IOException e)
			{
				throw new SandboxException("Internal Server Error", 500);
			}

		}
		else
		{
			throw new SandboxException("Missing required parameters", 400);
		}
	}
}
