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
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.PersonForProjects;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.ProjectOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.ProjectOutWithAssignedEmployeesTeams;
import com.thecodest.slack.holidayreminder.calamari.remote.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectsApi {
	private ApiClient apiClient;

	public ProjectsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ProjectsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 * Build call for archiveProjectType
	 *
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call archiveProjectTypeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/clockin/projects/v1/archive";

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
	private com.squareup.okhttp.Call archiveProjectTypeValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = archiveProjectTypeCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Archive project type.
	 * Archive project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PROJECT&lt;/strong&gt; - provided project id is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ProjectOut
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ProjectOut archiveProjectType() throws ApiException {
		ApiResponse<ProjectOut> resp = archiveProjectTypeWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Archive project type.
	 * Archive project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PROJECT&lt;/strong&gt; - provided project id is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ApiResponse&lt;ProjectOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<ProjectOut> archiveProjectTypeWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = archiveProjectTypeValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<ProjectOut>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Archive project type. (asynchronously)
	 * Archive project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PROJECT&lt;/strong&gt; - provided project id is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call archiveProjectTypeAsync(final ApiCallback<ProjectOut> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = archiveProjectTypeValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<ProjectOut>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for createProjectType
	 *
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call createProjectTypeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/clockin/projects/v1/create";

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
	private com.squareup.okhttp.Call createProjectTypeValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = createProjectTypeCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Create project type.
	 * Create project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ProjectOutWithAssignedEmployeesTeams
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ProjectOutWithAssignedEmployeesTeams createProjectType() throws ApiException {
		ApiResponse<ProjectOutWithAssignedEmployeesTeams> resp = createProjectTypeWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Create project type.
	 * Create project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ApiResponse&lt;ProjectOutWithAssignedEmployeesTeams&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<ProjectOutWithAssignedEmployeesTeams> createProjectTypeWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = createProjectTypeValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<ProjectOutWithAssignedEmployeesTeams>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Create project type. (asynchronously)
	 * Create project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call createProjectTypeAsync(final ApiCallback<ProjectOutWithAssignedEmployeesTeams> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = createProjectTypeValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<ProjectOutWithAssignedEmployeesTeams>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for getProjectForEmployee
	 *
	 * @param body                    (optional)
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getProjectForEmployeeCall(PersonForProjects body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = body;

		// create path and map variables
		String localVarPath = "/clockin/projects/v1/get-projects-for-person";

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
	private com.squareup.okhttp.Call getProjectForEmployeeValidateBeforeCall(PersonForProjects body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getProjectForEmployeeCall(body, progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get project types for one person.
	 * Get project types for one person.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return List&lt;ProjectOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<ProjectOut> getProjectForEmployee(PersonForProjects body) throws ApiException {
		ApiResponse<List<ProjectOut>> resp = getProjectForEmployeeWithHttpInfo(body);
		return resp.getData();
	}

	/**
	 * Get project types for one person.
	 * Get project types for one person.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body (optional)
	 * @return ApiResponse&lt;List&lt;ProjectOut&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<ProjectOut>> getProjectForEmployeeWithHttpInfo(PersonForProjects body) throws ApiException {
		com.squareup.okhttp.Call call = getProjectForEmployeeValidateBeforeCall(body, null, null);
		Type localVarReturnType = new TypeToken<List<ProjectOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get project types for one person. (asynchronously)
	 * Get project types for one person.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; - when invalid employee id provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param body     (optional)
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getProjectForEmployeeAsync(PersonForProjects body, final ApiCallback<List<ProjectOut>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = getProjectForEmployeeValidateBeforeCall(body, progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<ProjectOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for getProjects
	 *
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call getProjectsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/clockin/projects/v1/get-projects";

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
	private com.squareup.okhttp.Call getProjectsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = getProjectsCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Get project types.
	 * Get project types.
	 *
	 * @return List&lt;ProjectOut&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public List<ProjectOut> getProjects() throws ApiException {
		ApiResponse<List<ProjectOut>> resp = getProjectsWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Get project types.
	 * Get project types.
	 *
	 * @return ApiResponse&lt;List&lt;ProjectOut&gt;&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<List<ProjectOut>> getProjectsWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = getProjectsValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<List<ProjectOut>>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Get project types. (asynchronously)
	 * Get project types.
	 *
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call getProjectsAsync(final ApiCallback<List<ProjectOut>> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = getProjectsValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<List<ProjectOut>>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}

	/**
	 * Build call for updateProjectType
	 *
	 * @param progressListener        Progress listener
	 * @param progressRequestListener Progress request listener
	 * @return Call to execute
	 * @throws ApiException If fail to serialize the request body object
	 */
	public com.squareup.okhttp.Call updateProjectTypeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody = null;

		// create path and map variables
		String localVarPath = "/clockin/projects/v1/update";

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
	private com.squareup.okhttp.Call updateProjectTypeValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

		com.squareup.okhttp.Call call = updateProjectTypeCall(progressListener, progressRequestListener);
		return call;

	}

	/**
	 * Update project type.
	 * Update project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ProjectOutWithAssignedEmployeesTeams
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ProjectOutWithAssignedEmployeesTeams updateProjectType() throws ApiException {
		ApiResponse<ProjectOutWithAssignedEmployeesTeams> resp = updateProjectTypeWithHttpInfo();
		return resp.getData();
	}

	/**
	 * Update project type.
	 * Update project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @return ApiResponse&lt;ProjectOutWithAssignedEmployeesTeams&gt;
	 * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
	 */
	public ApiResponse<ProjectOutWithAssignedEmployeesTeams> updateProjectTypeWithHttpInfo() throws ApiException {
		com.squareup.okhttp.Call call = updateProjectTypeValidateBeforeCall(null, null);
		Type localVarReturnType = new TypeToken<ProjectOutWithAssignedEmployeesTeams>() {
		}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Update project type. (asynchronously)
	 * Update project type.&lt;br /&gt;&lt;br /&gt;Expect error codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_PERSON&lt;/strong&gt; - when one of provided persons is invalid&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when one of provided teams is invalid&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @param callback The callback to be executed when the API call finishes
	 * @return The request call
	 * @throws ApiException If fail to process the API call, e.g. serializing the request body object
	 */
	public com.squareup.okhttp.Call updateProjectTypeAsync(final ApiCallback<ProjectOutWithAssignedEmployeesTeams> callback) throws ApiException {

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

		com.squareup.okhttp.Call call = updateProjectTypeValidateBeforeCall(progressListener, progressRequestListener);
		Type localVarReturnType = new TypeToken<ProjectOutWithAssignedEmployeesTeams>() {
		}.getType();
		apiClient.executeAsync(call, localVarReturnType, callback);
		return call;
	}
}
