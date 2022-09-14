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
import com.thecodest.slack.holidayreminder.calamari.remote.ApiCallback;
import com.thecodest.slack.holidayreminder.calamari.remote.ApiClient;
import com.thecodest.slack.holidayreminder.calamari.remote.ApiException;
import com.thecodest.slack.holidayreminder.calamari.remote.ApiResponse;
import com.thecodest.slack.holidayreminder.calamari.remote.Configuration;
import com.thecodest.slack.holidayreminder.calamari.remote.Pair;
import com.thecodest.slack.holidayreminder.calamari.remote.ProgressRequestBody;
import com.thecodest.slack.holidayreminder.calamari.remote.ProgressResponseBody;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.WorkingWeekOut;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkingWeekApi {
	private ApiClient apiClient;

	public WorkingWeekApi() {
		this(Configuration.getDefaultApiClient());
	}

	public WorkingWeekApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Build call for getWorkingWeeks
	 *
	 * @param progressListener
	 *            Progress listener
	 * @param progressRequestListener
	 *            Progress request listener
	 * @return Call to execute
	 * @throws ApiException
	 *             If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getWorkingWeeksCall(final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/working-week/v1/all";

		List<Pair> localVarQueryParams = new ArrayList<Pair>();
		List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

		Map<String, String> localVarHeaderParams = new HashMap<String, String>();

		Map<String, Object> localVarFormParams = new HashMap<String, Object>();

		final String[] localVarAccepts = {"application/json"};
		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		if (localVarAccept != null)
			localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {

		};
		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (progressListener != null) {
			apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
				@Override
				public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
						throws IOException {
					com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
					return originalResponse.newBuilder()
							.body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
				}
			});
		}

		String[] localVarAuthNames = new String[]{"basicAuth"};
		return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
				localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	@SuppressWarnings("rawtypes")
	private com.squareup.okhttp.Call getWorkingWeeksValidateBeforeCall(
			final ProgressResponseBody.ProgressListener progressListener,
			final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getWorkingWeeksCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get all working weeks.
	 * Get all working weeks.
	 *
	 * @return List&lt;WorkingWeekOut&gt;
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot deserialize
	 *             the response body
	 */
	public List<WorkingWeekOut> getWorkingWeeks() throws ApiException {
		ApiResponse<List<WorkingWeekOut>> resp = getWorkingWeeksWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Get all working weeks.
	 * Get all working weeks.
	 *
	 * @return ApiResponse&lt;List&lt;WorkingWeekOut&gt;&gt;
	 * @throws ApiException
	 *             If fail to call the API, e.g. server error or cannot deserialize
	 *             the response body
	 */
	public ApiResponse<List<WorkingWeekOut>> getWorkingWeeksWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = getWorkingWeeksValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<List<WorkingWeekOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get all working weeks. (asynchronously)
	 * Get all working weeks.
	 *
	 * @param callback
	 *            The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException
	 *             If fail to process the API call, e.g. serializing the request
	 *             body object
	 */
	public com.squareup.okhttp.Call getWorkingWeeksAsync(final ApiCallback<List<WorkingWeekOut>> callback)
			throws ApiException {

		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

		if (callback != null) {
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

		com.squareup.okhttp.Call call = getWorkingWeeksValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<WorkingWeekOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}
}
