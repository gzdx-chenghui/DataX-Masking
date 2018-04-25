package com.alibaba.datax.core.transport.transformer.maskingMethods;

/**
 * General masking.
 *
 * @author Wenyan Liu
 */
public interface Masking {

    // TODO: Extract other methods.

    /**
     * Mask.
     *
     * @throws Exception if error occurs during masking
     */
    void mask() throws Exception;

}