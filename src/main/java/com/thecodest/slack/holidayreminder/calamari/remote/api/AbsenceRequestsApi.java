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

public class AbsenceRequestsApi {
	private ApiClient apiClient;

	public AbsenceRequestsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public AbsenceRequestsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Build call for createAbsenceRequest
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call createAbsenceRequestCall(CreateAbsenceRequestForParticularEmployee body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/request/v1/create";

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
	private com.squareup.okhttp.Call createAbsenceRequestValidateBeforeCall(CreateAbsenceRequestForParticularEmployee body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = createAbsenceRequestCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Create an absence request.
	 * Create an absence request.Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TIME&lt;/strong&gt; - when invalid absence time provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_ALLOWANCE&lt;/strong&gt; - when employee absence allowance is not enough&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_HIRE_DATE&lt;/strong&gt; - when employee hire date is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;REQUESTING_RULES_VIOLATED&lt;/strong&gt; - when requesting rules violated&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_APPROVAL_FLOW&lt;/strong&gt; - when approval flow is not configured&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REASON&lt;/strong&gt; - when invalid reason provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_SUBSTITUTE&lt;/strong&gt; - when invalid substitute provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TIME_PART&lt;/strong&gt; - when invalid time part provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return AbsenceRequestId
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public AbsenceRequestId createAbsenceRequest(CreateAbsenceRequestForParticularEmployee body) throws ApiException {
		ApiResponse<AbsenceRequestId> resp = createAbsenceRequestWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Create an absence request.
	 * Create an absence request.Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TIME&lt;/strong&gt; - when invalid absence time provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_ALLOWANCE&lt;/strong&gt; - when employee absence allowance is not enough&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_HIRE_DATE&lt;/strong&gt; - when employee hire date is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;REQUESTING_RULES_VIOLATED&lt;/strong&gt; - when requesting rules violated&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_APPROVAL_FLOW&lt;/strong&gt; - when approval flow is not configured&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REASON&lt;/strong&gt; - when invalid reason provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_SUBSTITUTE&lt;/strong&gt; - when invalid substitute provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TIME_PART&lt;/strong&gt; - when invalid time part provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;AbsenceRequestId&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<AbsenceRequestId> createAbsenceRequestWithHttpInfo(CreateAbsenceRequestForParticularEmployee body) throws ApiException {
		com.squareup.okhttp.Call call = createAbsenceRequestValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<AbsenceRequestId>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create an absence request. (asynchronously)
	 * Create an absence request.Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TIME&lt;/strong&gt; - when invalid absence time provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_ALLOWANCE&lt;/strong&gt; - when employee absence allowance is not enough&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_HIRE_DATE&lt;/strong&gt; - when employee hire date is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;REQUESTING_RULES_VIOLATED&lt;/strong&gt; - when requesting rules violated&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_APPROVAL_FLOW&lt;/strong&gt; - when approval flow is not configured&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when invalid absence type provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REASON&lt;/strong&gt; - when invalid reason provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_SUBSTITUTE&lt;/strong&gt; - when invalid substitute provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; - when invalid comment provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TIME_PART&lt;/strong&gt; - when invalid time part provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createAbsenceRequestAsync(CreateAbsenceRequestForParticularEmployee body, final ApiCallback<AbsenceRequestId> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createAbsenceRequestValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<AbsenceRequestId>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for createComment
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call createCommentCall(Comment body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/request/v1/create-comment";

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
	private com.squareup.okhttp.Call createCommentValidateBeforeCall(Comment body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = createCommentCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Create comment for chosen request.
	 * Create comment for chosen request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTENT&lt;/strong&gt; - when invalid content provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return List&lt;CommentOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<CommentOut> createComment(Comment body) throws ApiException {
		ApiResponse<List<CommentOut>> resp = createCommentWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Create comment for chosen request.
	 * Create comment for chosen request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTENT&lt;/strong&gt; - when invalid content provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;List&lt;CommentOut&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<CommentOut>> createCommentWithHttpInfo(Comment body) throws ApiException {
		com.squareup.okhttp.Call call = createCommentValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<List<CommentOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create comment for chosen request. (asynchronously)
	 * Create comment for chosen request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTENT&lt;/strong&gt; - when invalid content provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createCommentAsync(Comment body, final ApiCallback<List<CommentOut>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createCommentValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<CommentOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for find
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call findCall(FindAbsencesInRangeIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/request/v1/find";

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
	private com.squareup.okhttp.Call findValidateBeforeCall(FindAbsencesInRangeIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = findCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Find absence requests of employee in dates range.
	 * Find absence requests of employee in dates range.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid date from in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid date to in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return List&lt;AbsenceDto&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<AbsenceDto> find(FindAbsencesInRangeIn body) throws ApiException {
		ApiResponse<List<AbsenceDto>> resp = findWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Find absence requests of employee in dates range.
	 * Find absence requests of employee in dates range.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid date from in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid date to in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;List&lt;AbsenceDto&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<AbsenceDto>> findWithHttpInfo(FindAbsencesInRangeIn body) throws ApiException {
		com.squareup.okhttp.Call call = findValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<List<AbsenceDto>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Find absence requests of employee in dates range. (asynchronously)
	 * Find absence requests of employee in dates range.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid date from in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid date to in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call findAsync(FindAbsencesInRangeIn body, final ApiCallback<List<AbsenceDto>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = findValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<AbsenceDto>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for findExtended
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call findExtendedCall(FindAbsencesAdvancedIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/request/v1/find-advanced";

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
	private com.squareup.okhttp.Call findExtendedValidateBeforeCall(FindAbsencesAdvancedIn body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = findExtendedCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Find absence requests with advanced filtering by several parameters.
	 * Find absence requests in dates range. &lt;br /&gt;&lt;br /&gt;If you provide more than one value in one filter attribute there is OR relation between them.  For instance: if you put in a filter: {employees: [\&quot;john@mycompany.com\&quot;, \&quot;kevin@mycompany.com\&quot;]} it returns all John&#x27;s and all Kevin&#x27;s requests.&lt;br /&gt;&lt;br /&gt;When you fill more than one attribute in filter all conditions have to be fulfilled. There is AND relation between attributes. For instance: if you provide in filter {absenceTypes: [\&quot;PTO\&quot;], teams: [\&quot;DevTeam\&quot;]} then will be returned PTO requests of employees who are in team DevTeam.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when one of provided employees is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when one of provided absence types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_POSITION&lt;/strong&gt; - when one of provided positions is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTRACT_TYPE&lt;/strong&gt; - when one of provided contract types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return List&lt;AbsenceDtoExtended&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<AbsenceDtoExtended> findExtended(FindAbsencesAdvancedIn body) throws ApiException {
		ApiResponse<List<AbsenceDtoExtended>> resp = findExtendedWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Find absence requests with advanced filtering by several parameters.
	 * Find absence requests in dates range. &lt;br /&gt;&lt;br /&gt;If you provide more than one value in one filter attribute there is OR relation between them.  For instance: if you put in a filter: {employees: [\&quot;john@mycompany.com\&quot;, \&quot;kevin@mycompany.com\&quot;]} it returns all John&#x27;s and all Kevin&#x27;s requests.&lt;br /&gt;&lt;br /&gt;When you fill more than one attribute in filter all conditions have to be fulfilled. There is AND relation between attributes. For instance: if you provide in filter {absenceTypes: [\&quot;PTO\&quot;], teams: [\&quot;DevTeam\&quot;]} then will be returned PTO requests of employees who are in team DevTeam.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when one of provided employees is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when one of provided absence types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_POSITION&lt;/strong&gt; - when one of provided positions is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTRACT_TYPE&lt;/strong&gt; - when one of provided contract types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;List&lt;AbsenceDtoExtended&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<AbsenceDtoExtended>> findExtendedWithHttpInfo(FindAbsencesAdvancedIn body) throws ApiException {
		com.squareup.okhttp.Call call = findExtendedValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<List<AbsenceDtoExtended>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Find absence requests with advanced filtering by several parameters. (asynchronously)
	 * Find absence requests in dates range. &lt;br /&gt;&lt;br /&gt;If you provide more than one value in one filter attribute there is OR relation between them.  For instance: if you put in a filter: {employees: [\&quot;john@mycompany.com\&quot;, \&quot;kevin@mycompany.com\&quot;]} it returns all John&#x27;s and all Kevin&#x27;s requests.&lt;br /&gt;&lt;br /&gt;When you fill more than one attribute in filter all conditions have to be fulfilled. There is AND relation between attributes. For instance: if you provide in filter {absenceTypes: [\&quot;PTO\&quot;], teams: [\&quot;DevTeam\&quot;]} then will be returned PTO requests of employees who are in team DevTeam.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when one of provided employees is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; - when one of provided absence types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_POSITION&lt;/strong&gt; - when one of provided positions is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CONTRACT_TYPE&lt;/strong&gt; - when one of provided contract types is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_DATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_FROM&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_CREATE_UPDATE_TO&lt;/strong&gt; - when invalid time in filter provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call findExtendedAsync(FindAbsencesAdvancedIn body, final ApiCallback<List<AbsenceDtoExtended>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = findExtendedValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<AbsenceDtoExtended>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for removeRequest
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call removeRequestCall(AbsenceRequestId body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/leave/request/v1/remove";

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
	private com.squareup.okhttp.Call removeRequestValidateBeforeCall(AbsenceRequestId body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = removeRequestCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Remove chosen absence request.
	 * Remove chosen absence request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public void removeRequest(AbsenceRequestId body) throws ApiException {
		removeRequestWithHttpInfo(body);
	}

	/**
	 * Remove chosen absence request.
	 * Remove chosen absence request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;Void&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<Void> removeRequestWithHttpInfo(AbsenceRequestId body) throws ApiException {
		com.squareup.okhttp.Call call = removeRequestValidateBeforeCall(body, null, null);
		return apiClient.execute(call);
	}

	/**
	 * Remove chosen absence request. (asynchronously)
	 * Remove chosen absence request.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_REQUEST&lt;/strong&gt; - when invalid absence request provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call removeRequestAsync(AbsenceRequestId body, final ApiCallback<Void> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = removeRequestValidateBeforeCall(body, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}
}
