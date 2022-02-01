/**
 * TzKT API
 *
 * # Introduction  TzKT Explorer provides free REST API and WebSocket API for accessing detailed Tezos blockchain data and helps developers build more services and applications on top of Tezos. TzKT is an open-source project, so you can easily clone and build it and use it as a self-hosted service to avoid any risks of depending on third-party services.  TzKT API is available for the following Tezos networks with the following base URLs:  - Mainnet: `https://api.tzkt.io/` or `https://api.mainnet.tzkt.io/` ([view docs](https://api.tzkt.io))  - Granadanet: `https://api.granadanet.tzkt.io/` ([view docs](https://api.granadanet.tzkt.io))     - Hangzhou2net: `https://api.hangzhou2net.tzkt.io/` ([view docs](https://api.hangzhou2net.tzkt.io))  We also provide a staging environment for testing newest features and pre-updating client applications before deploying to production:  - Mainnet staging: `https://staging.api.tzkt.io/` or `https://staging.api.mainnet.tzkt.io/` ([view docs](https://staging.api.tzkt.io))  Feel free to contact us if you have any questions or feature requests. Your feedback really helps us make TzKT better!  - Discord: https://discord.gg/aG8XKuwsQd - Telegram: https://t.me/baking_bad_chat - Slack: https://tezos-dev.slack.com/archives/CV5NX7F2L - Twitter: https://twitter.com/TezosBakingBad - Email: hello@baking-bad.org  And don't forget to star TzKT project [on GitHub](https://github.com/baking-bad/tzkt) ;)  # Terms of Use  TzKT API is free for everyone and for both commercial and non-commercial usage.  If your application or service uses the TzKT API in any forms: directly on frontend or indirectly on backend, you should mention that fact on your website or application by placing the label **\"Powered by TzKT API\"** with a direct link to [tzkt.io](https://tzkt.io).   # Rate Limits  There will be no rate limits as long as our servers can handle the load without additional infrastructure costs. However, any apparent abuse will be prevented by setting targeted rate limits.  Check out [Tezos Explorer API Best Practices](https://baking-bad.org/blog/tag/TzKT/) and in particular [how to optimize requests count](https://baking-bad.org/blog/2020/07/29/tezos-explorer-api-tzkt-how-often-to-make-requests/).  --- 
 *
 * The version of the OpenAPI document: v1.7.0
 * Contact: hello@baking-bad.org
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.rarible.tezos.tzkt.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param eq **Equal** filter mode (optional, i.e. `param.eq=123` is the same as `param=123`). \\ Specify an integer number to get items where the specified field is equal to the specified value.  Example: `?balance=1234`.
 * @param ne **Not equal** filter mode. \\ Specify an integer number to get items where the specified field is not equal to the specified value.  Example: `?balance.ne=1234`.
 * @param gt **Greater than** filter mode. \\ Specify an integer number to get items where the specified field is greater than the specified value.  Example: `?balance.gt=1234`.
 * @param ge **Greater or equal** filter mode. \\ Specify an integer number to get items where the specified field is greater than equal to the specified value.  Example: `?balance.ge=1234`.
 * @param lt **Less than** filter mode. \\ Specify an integer number to get items where the specified field is less than the specified value.  Example: `?balance.lt=1234`.
 * @param le **Less or equal** filter mode. \\ Specify an integer number to get items where the specified field is less than or equal to the specified value.  Example: `?balance.le=1234`.
 * @param `in` **In list** (any of) filter mode. \\ Specify a comma-separated list of integers to get items where the specified field is equal to one of the specified values.  Example: `?level.in=12,14,52,69`.
 * @param ni **Not in list** (none of) filter mode. \\ Specify a comma-separated list of integers to get items where the specified field is not equal to all the specified values.  Example: `?level.ni=12,14,52,69`.
 */

data class Int32Parameter (

    /* **Equal** filter mode (optional, i.e. `param.eq=123` is the same as `param=123`). \\ Specify an integer number to get items where the specified field is equal to the specified value.  Example: `?balance=1234`. */
    @Json(name = "eq")
    val eq: kotlin.Int? = null,

    /* **Not equal** filter mode. \\ Specify an integer number to get items where the specified field is not equal to the specified value.  Example: `?balance.ne=1234`. */
    @Json(name = "ne")
    val ne: kotlin.Int? = null,

    /* **Greater than** filter mode. \\ Specify an integer number to get items where the specified field is greater than the specified value.  Example: `?balance.gt=1234`. */
    @Json(name = "gt")
    val gt: kotlin.Int? = null,

    /* **Greater or equal** filter mode. \\ Specify an integer number to get items where the specified field is greater than equal to the specified value.  Example: `?balance.ge=1234`. */
    @Json(name = "ge")
    val ge: kotlin.Int? = null,

    /* **Less than** filter mode. \\ Specify an integer number to get items where the specified field is less than the specified value.  Example: `?balance.lt=1234`. */
    @Json(name = "lt")
    val lt: kotlin.Int? = null,

    /* **Less or equal** filter mode. \\ Specify an integer number to get items where the specified field is less than or equal to the specified value.  Example: `?balance.le=1234`. */
    @Json(name = "le")
    val le: kotlin.Int? = null,

    /* **In list** (any of) filter mode. \\ Specify a comma-separated list of integers to get items where the specified field is equal to one of the specified values.  Example: `?level.in=12,14,52,69`. */
    @Json(name = "in")
    val `in`: kotlin.collections.List<kotlin.Int>? = null,

    /* **Not in list** (none of) filter mode. \\ Specify a comma-separated list of integers to get items where the specified field is not equal to all the specified values.  Example: `?level.ni=12,14,52,69`. */
    @Json(name = "ni")
    val ni: kotlin.collections.List<kotlin.Int>? = null

)

