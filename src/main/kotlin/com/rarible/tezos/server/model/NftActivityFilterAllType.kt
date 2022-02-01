package com.rarible.tezos.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
* Values: tRANSFER,mINT,bURN
*/
enum class NftActivityFilterAllType(val value: kotlin.String) {

    @JsonProperty("TRANSFER") tRANSFER("TRANSFER"),

    @JsonProperty("MINT") mINT("MINT"),

    @JsonProperty("BURN") bURN("BURN");

}

