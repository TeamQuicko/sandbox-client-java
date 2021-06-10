/**
 * Copyright Apr 22, 2021, Quicko.
 * All Rights Reserved.
 * Confidential Information
 * Authored by Manav Darji
 */
package in.co.sandbox.api.types;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.co.sandbox.api.utils.FilterUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class ENDPOINTS.
 */
public final class ENDPOINTS
{

	/** The Constant PROD_API_ENDPOINT. */
	public static final String PROD_API_ENDPOINT = "https://api.sandbox.co.in";

	/** The Constant LOCAL_API_ENDPOINT. */
	public static final String LOCAL_API_ENDPOINT = "http://localhost:8080/api-services";

	/**
	 * Build.
	 *
	 * @param endpoint
	 *            the endpoint
	 * @param args
	 *            arguments
	 * @return the string
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static String build(final URL endpoint, final Object... args)
	{
		String url = new StringBuilder().append(PROD_API_ENDPOINT).append(endpoint.getValue()).toString();

		String regex = "\\{(\\w*)\\}";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher;

		int i = 0;

		do
		{
			matcher = pattern.matcher(url);

			if (matcher.find())
			{
				url = url.replace(matcher.group(0),
				        args != null && args.length > i && args[i] != null && !args[i].toString().isEmpty()
				                ? (args[i] instanceof List || args[i] instanceof String[]
				                        ? FilterUtils.listToCSV((List) args[i])
				                        : args[i].toString())
				                : "");
			}

			i++;

		}
		while (matcher.find());

		return url.toString();

	}

	/**
	 * The Enum URL.
	 */
	public enum URL
	{

		/** The authenticate. */
		AUTHENTICATE("/authenticate"),

		/** The authorize. */
		AUTHORIZE("/authorize?request_token={requestToken}"),

	    /* OAUTH ENDPOINTS */

		/** The oauth authorize. */
		OAUTH_AUTHORIZE("/oauth/authorize?request_token={requestToken}"),

	    /* PAN ENDPOINTS */

		/** The get pan. */
		GET_PAN("/pans/{pan}?consent={consent}&reason={reason}"),

		/** The verify pan. */
		VERIFY_PAN("/pans/{pan}/verify?consent={consent}&reason={reason}"),

		/** The get pan aadhaar link status. */
		GET_PAN_AADHAAR_LINK_STATUS("/pans/{pan}/pan-aadhaar-status?aadhaar_number={aadhaar_number}"),

	    /* GST ENDPOINTS */

		/** The track GST Return. */
		TRACK_GST_RETURN("/gsp/public/gstr?gstin={gstin}&financial_year={financial_year}"),

		/** The Search GSTIN. */
		SEARCH_GSTIN("/gsp/public/gstin/{gstin}"),

		/** The Search GSTIN by PAN. */
		SEARCH_GSTIN_BY_PAN("/gsp/public/pan/{pan}?state_code={state_code}"),

		GST_ITEM_CODE_LOOKUP("/gst-portal/services/items?key={key}"),

	    /* BANK ENDPOINTS */

		/** The Fetch Bank Details by IFSC. */
		FETCH_BANK_DETAILS_BY_IFSC("/bank/{ifsc}"),

		/** Verify Bank Account. */
		VERIFY_BANK_ACCOUNT("/bank/{ifsc}/accounts/{account_number}/verify?name={name}&mobile={mobile}"),

	    /* CALCULATOR ENDPOINTS */

		/** The calculate tds. */
		CALCULATE_TDS("/calculators/tds"),

		/** The calculate company registration cost. */
		CALCULATE_COMPANY_REGISTRATION_COST(
		        "/calculators/roc/company/registration-fees?class={class}&state={state}&directors={directors}&share_capital={share_capital}"),

		/** The calculate partnership registration cost. */
		CALCULATE_PARTNERSHIP_REGISTRATION_COST(
		        "/calculators/roc/llp/registration-fees?incorporation_class={incorporation_class}&state={state}&partners={partners}&contribution={contribution}");

		/** The value. */
		private final String value;

		/**
		 * Instantiates a new url.
		 *
		 * @param value
		 *            the value
		 */
		URL(final String value)
		{
			this.value = value;
		}

		/**
		 * Gets the value.
		 *
		 * @return the value
		 */
		public String getValue()
		{
			return this.value;
		}

	}
}
