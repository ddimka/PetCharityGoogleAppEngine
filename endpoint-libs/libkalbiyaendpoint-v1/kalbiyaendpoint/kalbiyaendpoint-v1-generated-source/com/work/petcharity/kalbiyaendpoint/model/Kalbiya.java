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
 * (build: 2014-06-09 16:41:44 UTC)
 * on 2014-06-28 at 10:27:35 UTC 
 * Modify at your own risk.
 */

package com.work.petcharity.kalbiyaendpoint.model;

/**
 * Model definition for Kalbiya.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the kalbiyaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Kalbiya extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payPalAccount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responsiblePerson;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responsiblePersonTel;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Kalbiya setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Kalbiya setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPayPalAccount() {
    return payPalAccount;
  }

  /**
   * @param payPalAccount payPalAccount or {@code null} for none
   */
  public Kalbiya setPayPalAccount(java.lang.String payPalAccount) {
    this.payPalAccount = payPalAccount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhone() {
    return phone;
  }

  /**
   * @param phone phone or {@code null} for none
   */
  public Kalbiya setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getResponsiblePerson() {
    return responsiblePerson;
  }

  /**
   * @param responsiblePerson responsiblePerson or {@code null} for none
   */
  public Kalbiya setResponsiblePerson(java.lang.String responsiblePerson) {
    this.responsiblePerson = responsiblePerson;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getResponsiblePersonTel() {
    return responsiblePersonTel;
  }

  /**
   * @param responsiblePersonTel responsiblePersonTel or {@code null} for none
   */
  public Kalbiya setResponsiblePersonTel(java.lang.String responsiblePersonTel) {
    this.responsiblePersonTel = responsiblePersonTel;
    return this;
  }

  @Override
  public Kalbiya set(String fieldName, Object value) {
    return (Kalbiya) super.set(fieldName, value);
  }

  @Override
  public Kalbiya clone() {
    return (Kalbiya) super.clone();
  }

}
