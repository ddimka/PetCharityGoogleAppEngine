/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-06-30 15:48:57 UTC)
 * on 2014-07-12 at 07:43:45 UTC 
 * Modify at your own risk.
 */

package com.work.petcharity.petendpoint;

/**
 * Service definition for Petendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PetendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Petendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the petendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://petcharity-admin-app-32.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "petendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Petendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Petendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getPet".
   *
   * This request holds the parameters needed by the the petendpoint server.  After setting any
   * optional parameters, call the {@link GetPet#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetPet getPet(java.lang.Long id) throws java.io.IOException {
    GetPet result = new GetPet(id);
    initialize(result);
    return result;
  }

  public class GetPet extends PetendpointRequest<com.work.petcharity.petendpoint.model.Pet> {

    private static final String REST_PATH = "pet/{id}";

    /**
     * Create a request for the method "getPet".
     *
     * This request holds the parameters needed by the the petendpoint server.  After setting any
     * optional parameters, call the {@link GetPet#execute()} method to invoke the remote operation.
     * <p> {@link
     * GetPet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetPet(java.lang.Long id) {
      super(Petendpoint.this, "GET", REST_PATH, null, com.work.petcharity.petendpoint.model.Pet.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetPet setAlt(java.lang.String alt) {
      return (GetPet) super.setAlt(alt);
    }

    @Override
    public GetPet setFields(java.lang.String fields) {
      return (GetPet) super.setFields(fields);
    }

    @Override
    public GetPet setKey(java.lang.String key) {
      return (GetPet) super.setKey(key);
    }

    @Override
    public GetPet setOauthToken(java.lang.String oauthToken) {
      return (GetPet) super.setOauthToken(oauthToken);
    }

    @Override
    public GetPet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetPet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetPet setQuotaUser(java.lang.String quotaUser) {
      return (GetPet) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetPet setUserIp(java.lang.String userIp) {
      return (GetPet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetPet setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetPet set(String parameterName, Object value) {
      return (GetPet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertPet".
   *
   * This request holds the parameters needed by the the petendpoint server.  After setting any
   * optional parameters, call the {@link InsertPet#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.work.petcharity.petendpoint.model.Pet}
   * @return the request
   */
  public InsertPet insertPet(com.work.petcharity.petendpoint.model.Pet content) throws java.io.IOException {
    InsertPet result = new InsertPet(content);
    initialize(result);
    return result;
  }

  public class InsertPet extends PetendpointRequest<com.work.petcharity.petendpoint.model.Pet> {

    private static final String REST_PATH = "pet";

    /**
     * Create a request for the method "insertPet".
     *
     * This request holds the parameters needed by the the petendpoint server.  After setting any
     * optional parameters, call the {@link InsertPet#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertPet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.work.petcharity.petendpoint.model.Pet}
     * @since 1.13
     */
    protected InsertPet(com.work.petcharity.petendpoint.model.Pet content) {
      super(Petendpoint.this, "POST", REST_PATH, content, com.work.petcharity.petendpoint.model.Pet.class);
    }

    @Override
    public InsertPet setAlt(java.lang.String alt) {
      return (InsertPet) super.setAlt(alt);
    }

    @Override
    public InsertPet setFields(java.lang.String fields) {
      return (InsertPet) super.setFields(fields);
    }

    @Override
    public InsertPet setKey(java.lang.String key) {
      return (InsertPet) super.setKey(key);
    }

    @Override
    public InsertPet setOauthToken(java.lang.String oauthToken) {
      return (InsertPet) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertPet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertPet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertPet setQuotaUser(java.lang.String quotaUser) {
      return (InsertPet) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertPet setUserIp(java.lang.String userIp) {
      return (InsertPet) super.setUserIp(userIp);
    }

    @Override
    public InsertPet set(String parameterName, Object value) {
      return (InsertPet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listPet".
   *
   * This request holds the parameters needed by the the petendpoint server.  After setting any
   * optional parameters, call the {@link ListPet#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListPet listPet() throws java.io.IOException {
    ListPet result = new ListPet();
    initialize(result);
    return result;
  }

  public class ListPet extends PetendpointRequest<com.work.petcharity.petendpoint.model.CollectionResponsePet> {

    private static final String REST_PATH = "pet";

    /**
     * Create a request for the method "listPet".
     *
     * This request holds the parameters needed by the the petendpoint server.  After setting any
     * optional parameters, call the {@link ListPet#execute()} method to invoke the remote operation.
     * <p> {@link
     * ListPet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListPet() {
      super(Petendpoint.this, "GET", REST_PATH, null, com.work.petcharity.petendpoint.model.CollectionResponsePet.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListPet setAlt(java.lang.String alt) {
      return (ListPet) super.setAlt(alt);
    }

    @Override
    public ListPet setFields(java.lang.String fields) {
      return (ListPet) super.setFields(fields);
    }

    @Override
    public ListPet setKey(java.lang.String key) {
      return (ListPet) super.setKey(key);
    }

    @Override
    public ListPet setOauthToken(java.lang.String oauthToken) {
      return (ListPet) super.setOauthToken(oauthToken);
    }

    @Override
    public ListPet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListPet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListPet setQuotaUser(java.lang.String quotaUser) {
      return (ListPet) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListPet setUserIp(java.lang.String userIp) {
      return (ListPet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListPet setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListPet setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListPet set(String parameterName, Object value) {
      return (ListPet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removePet".
   *
   * This request holds the parameters needed by the the petendpoint server.  After setting any
   * optional parameters, call the {@link RemovePet#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemovePet removePet(java.lang.Long id) throws java.io.IOException {
    RemovePet result = new RemovePet(id);
    initialize(result);
    return result;
  }

  public class RemovePet extends PetendpointRequest<Void> {

    private static final String REST_PATH = "pet/{id}";

    /**
     * Create a request for the method "removePet".
     *
     * This request holds the parameters needed by the the petendpoint server.  After setting any
     * optional parameters, call the {@link RemovePet#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemovePet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemovePet(java.lang.Long id) {
      super(Petendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemovePet setAlt(java.lang.String alt) {
      return (RemovePet) super.setAlt(alt);
    }

    @Override
    public RemovePet setFields(java.lang.String fields) {
      return (RemovePet) super.setFields(fields);
    }

    @Override
    public RemovePet setKey(java.lang.String key) {
      return (RemovePet) super.setKey(key);
    }

    @Override
    public RemovePet setOauthToken(java.lang.String oauthToken) {
      return (RemovePet) super.setOauthToken(oauthToken);
    }

    @Override
    public RemovePet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemovePet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemovePet setQuotaUser(java.lang.String quotaUser) {
      return (RemovePet) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemovePet setUserIp(java.lang.String userIp) {
      return (RemovePet) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemovePet setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemovePet set(String parameterName, Object value) {
      return (RemovePet) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatePet".
   *
   * This request holds the parameters needed by the the petendpoint server.  After setting any
   * optional parameters, call the {@link UpdatePet#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.work.petcharity.petendpoint.model.Pet}
   * @return the request
   */
  public UpdatePet updatePet(com.work.petcharity.petendpoint.model.Pet content) throws java.io.IOException {
    UpdatePet result = new UpdatePet(content);
    initialize(result);
    return result;
  }

  public class UpdatePet extends PetendpointRequest<com.work.petcharity.petendpoint.model.Pet> {

    private static final String REST_PATH = "pet";

    /**
     * Create a request for the method "updatePet".
     *
     * This request holds the parameters needed by the the petendpoint server.  After setting any
     * optional parameters, call the {@link UpdatePet#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdatePet#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.work.petcharity.petendpoint.model.Pet}
     * @since 1.13
     */
    protected UpdatePet(com.work.petcharity.petendpoint.model.Pet content) {
      super(Petendpoint.this, "PUT", REST_PATH, content, com.work.petcharity.petendpoint.model.Pet.class);
    }

    @Override
    public UpdatePet setAlt(java.lang.String alt) {
      return (UpdatePet) super.setAlt(alt);
    }

    @Override
    public UpdatePet setFields(java.lang.String fields) {
      return (UpdatePet) super.setFields(fields);
    }

    @Override
    public UpdatePet setKey(java.lang.String key) {
      return (UpdatePet) super.setKey(key);
    }

    @Override
    public UpdatePet setOauthToken(java.lang.String oauthToken) {
      return (UpdatePet) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatePet setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatePet) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatePet setQuotaUser(java.lang.String quotaUser) {
      return (UpdatePet) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatePet setUserIp(java.lang.String userIp) {
      return (UpdatePet) super.setUserIp(userIp);
    }

    @Override
    public UpdatePet set(String parameterName, Object value) {
      return (UpdatePet) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Petendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Petendpoint}. */
    @Override
    public Petendpoint build() {
      return new Petendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link PetendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setPetendpointRequestInitializer(
        PetendpointRequestInitializer petendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(petendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
