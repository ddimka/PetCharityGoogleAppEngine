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
 * on 2014-07-12 at 07:43:37 UTC 
 * Modify at your own risk.
 */

package com.work.petcharity.paymentsendpoint.model;

/**
 * Model definition for Payments.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the paymentsendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Payments extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kalbiya;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String money;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long paymentId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String petName;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKalbiya() {
    return kalbiya;
  }

  /**
   * @param kalbiya kalbiya or {@code null} for none
   */
  public Payments setKalbiya(java.lang.String kalbiya) {
    this.kalbiya = kalbiya;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMoney() {
    return money;
  }

  /**
   * @param money money or {@code null} for none
   */
  public Payments setMoney(java.lang.String money) {
    this.money = money;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPaymentId() {
    return paymentId;
  }

  /**
   * @param paymentId paymentId or {@code null} for none
   */
  public Payments setPaymentId(java.lang.Long paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPetName() {
    return petName;
  }

  /**
   * @param petName petName or {@code null} for none
   */
  public Payments setPetName(java.lang.String petName) {
    this.petName = petName;
    return this;
  }

  @Override
  public Payments set(String fieldName, Object value) {
    return (Payments) super.set(fieldName, value);
  }

  @Override
  public Payments clone() {
    return (Payments) super.clone();
  }

}
