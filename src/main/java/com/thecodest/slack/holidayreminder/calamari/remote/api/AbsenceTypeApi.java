/*
 * Calamari API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * Contact: developers@calamari.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.thecodest.slack.holidayreminder.calamari.remote.api;

import com.google.gson.reflect.TypeToken;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.*;
import com.thecodest.slack.holidayreminder.calamari.remote.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbsenceTypeApi {
	private ApiClient apiClient;

	public AbsenceTypeApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AbsenceTypeApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Build call for getAbsenceTypes
	 *
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getAbsenceTypesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/leave/v1/get-absence-types";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {"application/json"};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if(localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[]{"basicAuth"};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	@SuppressWarnings("rawtypes")
	private com.squareup.okhttp.Call getAbsenceTypesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getAbsenceTypesCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get absence types with duration units.
	 * Get absence types with duration units. &lt;br/&gt;&lt;br/&gt;
	 *
	 * @return List&lt;GetAbsenceTypeOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<GetAbsenceTypeOut> getAbsenceTypes() throws ApiException {
		ApiResponse<List<GetAbsenceTypeOut>> resp = getAbsenceTypesWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Get absence types with duration units.
	 * Get absence types with duration units. &lt;br/&gt;&lt;br/&gt;
	 *
	 * @return ApiResponse&lt;List&lt;GetAbsenceTypeOut&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<GetAbsenceTypeOut>> getAbsenceTypesWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = getAbsenceTypesValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<List<GetAbsenceTypeOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get absence types with duration units. (asynchronously)
	 * Get absence types with duration units. &lt;br/&gt;&lt;br/&gt;
	 *
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getAbsenceTypesAsync(final ApiCallback<List<GetAbsenceTypeOut>> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if(callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = getAbsenceTypesValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<GetAbsenceTypeOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for getEntitlementBalance
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getEntitlementBalanceCall(GetBalanceOfEmployeeAndAbsenceType body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/v1/entitlement-balance/get";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {"application/json"};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if(localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json"};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[]{"basicAuth"};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	@SuppressWarnings("rawtypes")
	private com.squareup.okhttp.Call getEntitlementBalanceValidateBeforeCall(GetBalanceOfEmployeeAndAbsenceType body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getEntitlementBalanceCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get entitlement balance.
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employee and absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return BalanceOut
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public BalanceOut getEntitlementBalance(GetBalanceOfEmployeeAndAbsenceType body) throws ApiException {
		ApiResponse<BalanceOut> resp = getEntitlementBalanceWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Get entitlement balance.
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employee and absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;BalanceOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<BalanceOut> getEntitlementBalanceWithHttpInfo(GetBalanceOfEmployeeAndAbsenceType body) throws ApiException {
		com.squareup.okhttp.Call call = getEntitlementBalanceValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<BalanceOut>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get entitlement balance. (asynchronously)
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employee and absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getEntitlementBalanceAsync(GetBalanceOfEmployeeAndAbsenceType body, final ApiCallback<BalanceOut> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if(callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = getEntitlementBalanceValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<BalanceOut>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for getEntitlementBalances
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getEntitlementBalancesCall(GetEmployeesBalancesIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/v1/entitlement-balance/get-advanced";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {"application/json"};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if(localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json"};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[]{"basicAuth"};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	@SuppressWarnings("rawtypes")
	private com.squareup.okhttp.Call getEntitlementBalancesValidateBeforeCall(GetEmployeesBalancesIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getEntitlementBalancesCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get entitlement balance with advanced filtering by several parameters.
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employees and absence types on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when invalid team provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return List&lt;EmployeeBalanceOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<EmployeeBalanceOut> getEntitlementBalances(GetEmployeesBalancesIn body) throws ApiException {
		ApiResponse<List<EmployeeBalanceOut>> resp = getEntitlementBalancesWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Get entitlement balance with advanced filtering by several parameters.
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employees and absence types on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when invalid team provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;List&lt;EmployeeBalanceOut&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<EmployeeBalanceOut>> getEntitlementBalancesWithHttpInfo(GetEmployeesBalancesIn body) throws ApiException {
		com.squareup.okhttp.Call call = getEntitlementBalancesValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<List<EmployeeBalanceOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get entitlement balance with advanced filtering by several parameters. (asynchronously)
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get the entitlement balance for selected employees and absence types on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when invalid team provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getEntitlementBalancesAsync(GetEmployeesBalancesIn body, final ApiCallback<List<EmployeeBalanceOut>> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if(callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = getEntitlementBalancesValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<EmployeeBalanceOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for manualCreateEntitlementBalance
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call manualCreateEntitlementBalanceCall(CreateBalanceIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/v1/entitlement-balance/create";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {"application/json"};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if(localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json"};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if(progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[]{"basicAuth"};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	@SuppressWarnings("rawtypes")
	private com.squareup.okhttp.Call manualCreateEntitlementBalanceValidateBeforeCall(CreateBalanceIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = manualCreateEntitlementBalanceCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Create entitlement balance.
	 * Create entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to add the entitlement balance of a selected absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_AMOUNT&lt;/strong&gt; - when invalid amount provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_AS_OF_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ModifyBalanceOut
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ModifyBalanceOut manualCreateEntitlementBalance(CreateBalanceIn body) throws ApiException {
		ApiResponse<ModifyBalanceOut> resp = manualCreateEntitlementBalanceWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Create entitlement balance.
	 * Create entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to add the entitlement balance of a selected absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_AMOUNT&lt;/strong&gt; - when invalid amount provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_AS_OF_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;ModifyBalanceOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<ModifyBalanceOut> manualCreateEntitlementBalanceWithHttpInfo(CreateBalanceIn body) throws ApiException {
		com.squareup.okhttp.Call call = manualCreateEntitlementBalanceValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<ModifyBalanceOut>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create entitlement balance. (asynchronously)
	 * Create entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to add the entitlement balance of a selected absence type on a selected day.&lt;br &gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_AMOUNT&lt;/strong&gt; - when invalid amount provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_AS_OF_DATE&lt;/strong&gt; - when invalid date provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid balance owner provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call manualCreateEntitlementBalanceAsync(CreateBalanceIn body, final ApiCallback<ModifyBalanceOut> callback) throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if(callback != null) {
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done) {
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};

			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}

		com.squareup.okhttp.Call call = manualCreateEntitlementBalanceValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<ModifyBalanceOut>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}
}
