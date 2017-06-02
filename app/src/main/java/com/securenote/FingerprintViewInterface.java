package com.securenote;

import android.hardware.fingerprint.FingerprintManager;
import android.support.annotation.Nullable;

/**
 * Created by serhii.hrabas on 5/25/2017.
 */

public interface FingerprintViewInterface {
    /**
     * Creates a symmetric key in the Android Key Store which can only be used after the user has
     * authenticated with fingerprint.
     *
     * @param keyName the name of the key to be created
     * @param invalidatedByBiometricEnrollment if {@code false} is passed, the created key will not
     *                                         be invalidated even if a new fingerprint is enrolled.
     *                                         The default value is {@code true}, so passing
     *                                         {@code true} doesn't change the behavior
     *                                         (the key will be invalidated if a new fingerprint is
     *                                         enrolled.). Note that this parameter is only valid if
     *                                         the app works on Android N developer preview.
     *
     */
    void createKey(String keyName, boolean invalidatedByBiometricEnrollment);

    /**
     * Proceed the purchase operation
     *
     * @param withFingerprint {@code true} if the purchase was made by using a fingerprint
     * @param cryptoObject the Crypto object
     */
    void onLoggedIn(boolean withFingerprint,
                    @Nullable FingerprintManager.CryptoObject cryptoObject);


}
