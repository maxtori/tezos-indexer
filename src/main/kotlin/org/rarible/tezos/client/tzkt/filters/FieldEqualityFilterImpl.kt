package org.rarible.tezos.client.tzkt.filters

import com.squareup.moshi.Json

class FieldEqualityFilterImpl: FieldEqualityFilter {
    /* **Equal to another field** filter mode. \\ Specify a field name to get items where the specified fields are equal.  Example: `?sender.eqx=target`. */
    @Json(name = "eqx")
    override val eqx: String? = null

    /* **Not equal to another field** filter mode. \\ Specify a field name to get items where the specified fields are not equal.  Example: `?sender.nex=initiator`. */
    @Json(name = "nex")
    override val nex: String?  = null

    override fun getEqualityFilterValue(): String {
        return eqx ?: nex ?: ""
    }

    override fun applyFilterToField(filter: String): String{
        return if (eqx != null){
            "$filter.eqx"
        } else if (nex != null){
            "$filter.nex"
        } else {
            "$filter"
        }
    }
}