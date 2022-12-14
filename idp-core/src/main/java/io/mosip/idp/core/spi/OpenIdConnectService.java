/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.idp.core.spi;

import io.mosip.idp.core.exception.IdPException;
import java.util.Map;

public interface OpenIdConnectService {

    /**
     * UserInfo Endpoint returns Claims about the authenticated End-User
     * @param accessToken
     * @return JWT signed with IDP key. Payload is encrypted with registered client's public key.
     * @throws IdPException
     */
    String getUserInfo(String accessToken) throws IdPException;

    /**
     * Discovery endpoint, returns all the supported values and host endpoints
     * @return key-value pairs as per OIDC spec
     */
    Map<String, Object> getOpenIdConfiguration();
}
