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

package org.rarible.tezos.client.tzkt.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param rampUpCycles The number of cycles where security deposit is ramping up
 * @param noRewardCycles The number of cycles with no baking rewards
 * @param preservedCycles A number of cycles in which baker's security deposit and rewards are frozen
 * @param blocksPerCycle A number of blocks the cycle contains
 * @param blocksPerCommitment A number of blocks that indicates how often seed nonce hash is included in a block. Seed nonce hash presents in only one out of `blocksPerCommitment`
 * @param blocksPerSnapshot A number of blocks that indicates how often a snapshot (snapshots are records of the state of rolls distributions) is taken
 * @param blocksPerVoting A number of block that indicates how long a voting period takes
 * @param timeBetweenBlocks Minimum amount of seconds between blocks
 * @param endorsersPerBlock Number of bakers that assigned to endorse a block
 * @param hardOperationGasLimit Maximum amount of gas that one operation can consume
 * @param hardOperationStorageLimit Maximum amount of storage that one operation can consume
 * @param hardBlockGasLimit Maximum amount of total gas usage of a single block
 * @param tokensPerRoll Required number of tokens to get 1 roll (micro tez)
 * @param revelationReward Reward for seed nonce revelation (micro tez)
 * @param blockDeposit Security deposit for baking (producing) a block (micro tez)
 * @param blockReward Reward for baking (producing) a block (micro tez)
 * @param endorsementDeposit Security deposit for sending an endorsement operation (micro tez)
 * @param endorsementReward Reward for sending an endorsement operation (micro tez)
 * @param originationSize Initial storage size of an originated (created) account (bytes)
 * @param byteCost Cost of one storage byte in the blockchain (micro tez)
 * @param proposalQuorum Percentage of the total number of rolls required to select a proposal on the proposal period
 * @param ballotQuorumMin The minimum value of quorum percentage on the exploration and promotion periods
 * @param ballotQuorumMax The maximum value of quorum percentage on the exploration and promotion periods
 * @param lbSubsidy Liquidity baking subsidy is 1/16th of total rewards for a block of priority 0 with all endorsements
 * @param lbSunsetLevel Level after protocol activation when liquidity baking shuts off
 * @param lbEscapeThreshold 1/2 window size of 2000 blocks with precision of 1000 for integer computation
 */

data class ProtocolConstants (

    /* The number of cycles where security deposit is ramping up */
    @Json(name = "rampUpCycles")
    val rampUpCycles: kotlin.Int? = null,

    /* The number of cycles with no baking rewards */
    @Json(name = "noRewardCycles")
    val noRewardCycles: kotlin.Int? = null,

    /* A number of cycles in which baker's security deposit and rewards are frozen */
    @Json(name = "preservedCycles")
    val preservedCycles: kotlin.Int? = null,

    /* A number of blocks the cycle contains */
    @Json(name = "blocksPerCycle")
    val blocksPerCycle: kotlin.Int? = null,

    /* A number of blocks that indicates how often seed nonce hash is included in a block. Seed nonce hash presents in only one out of `blocksPerCommitment` */
    @Json(name = "blocksPerCommitment")
    val blocksPerCommitment: kotlin.Int? = null,

    /* A number of blocks that indicates how often a snapshot (snapshots are records of the state of rolls distributions) is taken */
    @Json(name = "blocksPerSnapshot")
    val blocksPerSnapshot: kotlin.Int? = null,

    /* A number of block that indicates how long a voting period takes */
    @Json(name = "blocksPerVoting")
    val blocksPerVoting: kotlin.Int? = null,

    /* Minimum amount of seconds between blocks */
    @Json(name = "timeBetweenBlocks")
    val timeBetweenBlocks: kotlin.Int? = null,

    /* Number of bakers that assigned to endorse a block */
    @Json(name = "endorsersPerBlock")
    val endorsersPerBlock: kotlin.Int? = null,

    /* Maximum amount of gas that one operation can consume */
    @Json(name = "hardOperationGasLimit")
    val hardOperationGasLimit: kotlin.Int? = null,

    /* Maximum amount of storage that one operation can consume */
    @Json(name = "hardOperationStorageLimit")
    val hardOperationStorageLimit: kotlin.Int? = null,

    /* Maximum amount of total gas usage of a single block */
    @Json(name = "hardBlockGasLimit")
    val hardBlockGasLimit: kotlin.Int? = null,

    /* Required number of tokens to get 1 roll (micro tez) */
    @Json(name = "tokensPerRoll")
    val tokensPerRoll: kotlin.Long? = null,

    /* Reward for seed nonce revelation (micro tez) */
    @Json(name = "revelationReward")
    val revelationReward: kotlin.Long? = null,

    /* Security deposit for baking (producing) a block (micro tez) */
    @Json(name = "blockDeposit")
    val blockDeposit: kotlin.Long? = null,

    /* Reward for baking (producing) a block (micro tez) */
    @Json(name = "blockReward")
    val blockReward: kotlin.collections.List<kotlin.Long>? = null,

    /* Security deposit for sending an endorsement operation (micro tez) */
    @Json(name = "endorsementDeposit")
    val endorsementDeposit: kotlin.Long? = null,

    /* Reward for sending an endorsement operation (micro tez) */
    @Json(name = "endorsementReward")
    val endorsementReward: kotlin.collections.List<kotlin.Long>? = null,

    /* Initial storage size of an originated (created) account (bytes) */
    @Json(name = "originationSize")
    val originationSize: kotlin.Int? = null,

    /* Cost of one storage byte in the blockchain (micro tez) */
    @Json(name = "byteCost")
    val byteCost: kotlin.Int? = null,

    /* Percentage of the total number of rolls required to select a proposal on the proposal period */
    @Json(name = "proposalQuorum")
    val proposalQuorum: kotlin.Double? = null,

    /* The minimum value of quorum percentage on the exploration and promotion periods */
    @Json(name = "ballotQuorumMin")
    val ballotQuorumMin: kotlin.Double? = null,

    /* The maximum value of quorum percentage on the exploration and promotion periods */
    @Json(name = "ballotQuorumMax")
    val ballotQuorumMax: kotlin.Double? = null,

    /* Liquidity baking subsidy is 1/16th of total rewards for a block of priority 0 with all endorsements */
    @Json(name = "lbSubsidy")
    val lbSubsidy: kotlin.Int? = null,

    /* Level after protocol activation when liquidity baking shuts off */
    @Json(name = "lbSunsetLevel")
    val lbSunsetLevel: kotlin.Int? = null,

    /* 1/2 window size of 2000 blocks with precision of 1000 for integer computation */
    @Json(name = "lbEscapeThreshold")
    val lbEscapeThreshold: kotlin.Int? = null

)
