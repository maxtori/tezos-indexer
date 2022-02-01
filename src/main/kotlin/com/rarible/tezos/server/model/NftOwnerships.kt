package com.rarible.tezos.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.rarible.tezos.server.model.NftOwnership
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param total 
 * @param ownerships 
 * @param continuation 
 */
data class NftOwnerships(

    @get:Min(0)
    @get:Max(9007199254740992)
    @field:JsonProperty("total", required = true) val total: kotlin.Int,

    @field:Valid
    @field:JsonProperty("ownerships", required = true) val ownerships: kotlin.collections.List<NftOwnership>,

    @field:JsonProperty("continuation") val continuation: kotlin.String? = null
) {

}

