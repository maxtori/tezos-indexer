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

import com.rarible.tezos.tzkt.models.Alias
import com.rarible.tezos.tzkt.models.QuoteShort

import com.squareup.moshi.Json

/**
 * 
 *
 * @param cycle Cycle in which rewards have been or will be earned.
 * @param balance Delegator balance at the snapshot time.
 * @param baker Baker at the snapshot time.
 * @param stakingBalance Staking balance of the baker at the snapshot time.
 * @param expectedBlocks Expected value of how many blocks baker should produce based on baker's rolls, total rolls and blocks per cycle.
 * @param expectedEndorsements Expected value of how many slots baker should validate based on baker's rolls, total rolls and endorsing slots per cycle.
 * @param futureBlocks Number of blocks which baker is allowed to produce in this cycle based on future baking rights.
 * @param futureBlockRewards Estimated value of future block rewards.
 * @param ownBlocks Number of successfully baked blocks with priority `0`.
 * @param ownBlockRewards Rewards received for blocks baked with priority `0`.
 * @param extraBlocks Number of successfully baked blocks with priority `1+`.
 * @param extraBlockRewards Rewards received for blocks baked with priority `1+`.
 * @param missedOwnBlocks Number of blocks which were missed at priority `0` for no apparent reason (usually due to issues with network or node).
 * @param missedOwnBlockRewards Rewards which were not received due to missing own blocks.
 * @param missedExtraBlocks Number of blocks which were missed at priority `1+` for no apparent reason (usually due to issues with network or node).
 * @param missedExtraBlockRewards Rewards which were not received due to missing extra blocks.
 * @param uncoveredOwnBlocks Number of blocks which were missed at priority `0` due to lack of bonds (for example, when a baker is overdelegated).
 * @param uncoveredOwnBlockRewards Rewards which were not received due to missing own blocks due to lack of bonds.
 * @param uncoveredExtraBlocks Number of blocks which were missed at priority `1+` due to lack of bonds (for example, when a baker is overdelegated).
 * @param uncoveredExtraBlockRewards Rewards which were not received due to missing extra blocks due to lack of bonds.
 * @param futureEndorsements Number of slots which baker is allowed to validate in this cycle based on future endorsing rights.
 * @param futureEndorsementRewards Estimated value of future endorsing rewards.
 * @param endorsements Number of successfully endorsed slots.
 * @param endorsementRewards Rewards received for endorsed slots.
 * @param missedEndorsements Number of endorsing slots which were missed for no apparent reason (usually due to issues with network or node).
 * @param missedEndorsementRewards Rewards which were not received due to missing endorsements.
 * @param uncoveredEndorsements Number of endorsing slots which were missed due to lack of bonds (for example, when a baker is overdelegated).
 * @param uncoveredEndorsementRewards Rewards which were not received due to missing endorsements due to lack of bonds.
 * @param ownBlockFees Operation fees which were harvested from successfully baked blocks with priority `0`.
 * @param extraBlockFees Operation fees which were harvested from successfully baked blocks with priority `1+`.
 * @param missedOwnBlockFees Operation fees which were not received due to missing own blocks.
 * @param missedExtraBlockFees Operation fees which were not received due to missing extra blocks.
 * @param uncoveredOwnBlockFees Operation fees which were not received due to missing own blocks (due to lack of bonds).
 * @param uncoveredExtraBlockFees Operation fees which were not received due to missing extra blocks (due to lack of bonds).
 * @param doubleBakingRewards Rewards for detecting double baking (accusing someone of producing two different blocks at the same level).
 * @param doubleBakingLostDeposits Bonds lost due to double baking
 * @param doubleBakingLostRewards Rewards lost due to double baking
 * @param doubleBakingLostFees Fees lost due to double baking
 * @param doubleEndorsingRewards Rewards for detecting double endorsing (accusing someone of validating two different blocks at the same level).
 * @param doubleEndorsingLostDeposits Bonds lost due to double endorsing
 * @param doubleEndorsingLostRewards Rewards lost due to double endorsing
 * @param doubleEndorsingLostFees Fees lost due to double endorsing
 * @param revelationRewards Rewards for including into a block seed nonce revelation operations.
 * @param revelationLostRewards Rewards lost due to missing seed nonce revelation.
 * @param revelationLostFees Fees lost due to missing seed nonce revelation.
 * @param quote Injected historical quote at the end of the cycle
 */

data class DelegatorRewards (

    /* Cycle in which rewards have been or will be earned. */
    @Json(name = "cycle")
    val cycle: kotlin.Int? = null,

    /* Delegator balance at the snapshot time. */
    @Json(name = "balance")
    val balance: kotlin.Long? = null,

    /* Baker at the snapshot time. */
    @Json(name = "baker")
    val baker: OneOfLessThanAliasGreaterThan? = null,

    /* Staking balance of the baker at the snapshot time. */
    @Json(name = "stakingBalance")
    val stakingBalance: kotlin.Long? = null,

    /* Expected value of how many blocks baker should produce based on baker's rolls, total rolls and blocks per cycle. */
    @Json(name = "expectedBlocks")
    val expectedBlocks: kotlin.Double? = null,

    /* Expected value of how many slots baker should validate based on baker's rolls, total rolls and endorsing slots per cycle. */
    @Json(name = "expectedEndorsements")
    val expectedEndorsements: kotlin.Double? = null,

    /* Number of blocks which baker is allowed to produce in this cycle based on future baking rights. */
    @Json(name = "futureBlocks")
    val futureBlocks: kotlin.Int? = null,

    /* Estimated value of future block rewards. */
    @Json(name = "futureBlockRewards")
    val futureBlockRewards: kotlin.Long? = null,

    /* Number of successfully baked blocks with priority `0`. */
    @Json(name = "ownBlocks")
    val ownBlocks: kotlin.Int? = null,

    /* Rewards received for blocks baked with priority `0`. */
    @Json(name = "ownBlockRewards")
    val ownBlockRewards: kotlin.Long? = null,

    /* Number of successfully baked blocks with priority `1+`. */
    @Json(name = "extraBlocks")
    val extraBlocks: kotlin.Int? = null,

    /* Rewards received for blocks baked with priority `1+`. */
    @Json(name = "extraBlockRewards")
    val extraBlockRewards: kotlin.Long? = null,

    /* Number of blocks which were missed at priority `0` for no apparent reason (usually due to issues with network or node). */
    @Json(name = "missedOwnBlocks")
    val missedOwnBlocks: kotlin.Int? = null,

    /* Rewards which were not received due to missing own blocks. */
    @Json(name = "missedOwnBlockRewards")
    val missedOwnBlockRewards: kotlin.Long? = null,

    /* Number of blocks which were missed at priority `1+` for no apparent reason (usually due to issues with network or node). */
    @Json(name = "missedExtraBlocks")
    val missedExtraBlocks: kotlin.Int? = null,

    /* Rewards which were not received due to missing extra blocks. */
    @Json(name = "missedExtraBlockRewards")
    val missedExtraBlockRewards: kotlin.Long? = null,

    /* Number of blocks which were missed at priority `0` due to lack of bonds (for example, when a baker is overdelegated). */
    @Json(name = "uncoveredOwnBlocks")
    val uncoveredOwnBlocks: kotlin.Int? = null,

    /* Rewards which were not received due to missing own blocks due to lack of bonds. */
    @Json(name = "uncoveredOwnBlockRewards")
    val uncoveredOwnBlockRewards: kotlin.Long? = null,

    /* Number of blocks which were missed at priority `1+` due to lack of bonds (for example, when a baker is overdelegated). */
    @Json(name = "uncoveredExtraBlocks")
    val uncoveredExtraBlocks: kotlin.Int? = null,

    /* Rewards which were not received due to missing extra blocks due to lack of bonds. */
    @Json(name = "uncoveredExtraBlockRewards")
    val uncoveredExtraBlockRewards: kotlin.Long? = null,

    /* Number of slots which baker is allowed to validate in this cycle based on future endorsing rights. */
    @Json(name = "futureEndorsements")
    val futureEndorsements: kotlin.Int? = null,

    /* Estimated value of future endorsing rewards. */
    @Json(name = "futureEndorsementRewards")
    val futureEndorsementRewards: kotlin.Long? = null,

    /* Number of successfully endorsed slots. */
    @Json(name = "endorsements")
    val endorsements: kotlin.Int? = null,

    /* Rewards received for endorsed slots. */
    @Json(name = "endorsementRewards")
    val endorsementRewards: kotlin.Long? = null,

    /* Number of endorsing slots which were missed for no apparent reason (usually due to issues with network or node). */
    @Json(name = "missedEndorsements")
    val missedEndorsements: kotlin.Int? = null,

    /* Rewards which were not received due to missing endorsements. */
    @Json(name = "missedEndorsementRewards")
    val missedEndorsementRewards: kotlin.Long? = null,

    /* Number of endorsing slots which were missed due to lack of bonds (for example, when a baker is overdelegated). */
    @Json(name = "uncoveredEndorsements")
    val uncoveredEndorsements: kotlin.Int? = null,

    /* Rewards which were not received due to missing endorsements due to lack of bonds. */
    @Json(name = "uncoveredEndorsementRewards")
    val uncoveredEndorsementRewards: kotlin.Long? = null,

    /* Operation fees which were harvested from successfully baked blocks with priority `0`. */
    @Json(name = "ownBlockFees")
    val ownBlockFees: kotlin.Long? = null,

    /* Operation fees which were harvested from successfully baked blocks with priority `1+`. */
    @Json(name = "extraBlockFees")
    val extraBlockFees: kotlin.Long? = null,

    /* Operation fees which were not received due to missing own blocks. */
    @Json(name = "missedOwnBlockFees")
    val missedOwnBlockFees: kotlin.Long? = null,

    /* Operation fees which were not received due to missing extra blocks. */
    @Json(name = "missedExtraBlockFees")
    val missedExtraBlockFees: kotlin.Long? = null,

    /* Operation fees which were not received due to missing own blocks (due to lack of bonds). */
    @Json(name = "uncoveredOwnBlockFees")
    val uncoveredOwnBlockFees: kotlin.Long? = null,

    /* Operation fees which were not received due to missing extra blocks (due to lack of bonds). */
    @Json(name = "uncoveredExtraBlockFees")
    val uncoveredExtraBlockFees: kotlin.Long? = null,

    /* Rewards for detecting double baking (accusing someone of producing two different blocks at the same level). */
    @Json(name = "doubleBakingRewards")
    val doubleBakingRewards: kotlin.Long? = null,

    /* Bonds lost due to double baking */
    @Json(name = "doubleBakingLostDeposits")
    val doubleBakingLostDeposits: kotlin.Long? = null,

    /* Rewards lost due to double baking */
    @Json(name = "doubleBakingLostRewards")
    val doubleBakingLostRewards: kotlin.Long? = null,

    /* Fees lost due to double baking */
    @Json(name = "doubleBakingLostFees")
    val doubleBakingLostFees: kotlin.Long? = null,

    /* Rewards for detecting double endorsing (accusing someone of validating two different blocks at the same level). */
    @Json(name = "doubleEndorsingRewards")
    val doubleEndorsingRewards: kotlin.Long? = null,

    /* Bonds lost due to double endorsing */
    @Json(name = "doubleEndorsingLostDeposits")
    val doubleEndorsingLostDeposits: kotlin.Long? = null,

    /* Rewards lost due to double endorsing */
    @Json(name = "doubleEndorsingLostRewards")
    val doubleEndorsingLostRewards: kotlin.Long? = null,

    /* Fees lost due to double endorsing */
    @Json(name = "doubleEndorsingLostFees")
    val doubleEndorsingLostFees: kotlin.Long? = null,

    /* Rewards for including into a block seed nonce revelation operations. */
    @Json(name = "revelationRewards")
    val revelationRewards: kotlin.Long? = null,

    /* Rewards lost due to missing seed nonce revelation. */
    @Json(name = "revelationLostRewards")
    val revelationLostRewards: kotlin.Long? = null,

    /* Fees lost due to missing seed nonce revelation. */
    @Json(name = "revelationLostFees")
    val revelationLostFees: kotlin.Long? = null,

    /* Injected historical quote at the end of the cycle */
    @Json(name = "quote")
    val quote: OneOfLessThanQuoteShortGreaterThan? = null

)

