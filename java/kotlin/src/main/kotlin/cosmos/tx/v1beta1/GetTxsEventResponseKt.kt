//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun getTxsEventResponse(block: cosmos.tx.v1beta1.GetTxsEventResponseKt.Dsl.() -> Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse =
  cosmos.tx.v1beta1.GetTxsEventResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse.newBuilder()).apply { block() }._build()
object GetTxsEventResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class TxsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     */
     val txs: com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTxsList()
      )
    /**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTxs")
    fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.add(value: cosmos.tx.v1beta1.TxOuterClass.Tx) {
      _builder.addTxs(value)
    }/**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     * @param value The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTxs")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.plusAssign(value: cosmos.tx.v1beta1.TxOuterClass.Tx) {
      add(value)
    }/**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTxs")
    fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.tx.v1beta1.TxOuterClass.Tx>) {
      _builder.addAllTxs(values)
    }/**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     * @param values The txs to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTxs")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.tx.v1beta1.TxOuterClass.Tx>) {
      addAll(values)
    }/**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     * @param index The index to set the value at.
     * @param value The txs to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTxs")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.set(index: kotlin.Int, value: cosmos.tx.v1beta1.TxOuterClass.Tx) {
      _builder.setTxs(index, value)
    }/**
     * <pre>
     * txs is the list of queried transactions.
     * </pre>
     *
     * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTxs")
    fun com.google.protobuf.kotlin.DslList<cosmos.tx.v1beta1.TxOuterClass.Tx, TxsProxy>.clear() {
      _builder.clearTxs()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class TxResponsesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     */
     val txResponses: com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTxResponsesList()
      )
    /**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     * @param value The txResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTxResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.add(value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      _builder.addTxResponses(value)
    }/**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     * @param value The txResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTxResponses")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.plusAssign(value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      add(value)
    }/**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     * @param values The txResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTxResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.abci.v1beta1.Abci.TxResponse>) {
      _builder.addAllTxResponses(values)
    }/**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     * @param values The txResponses to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTxResponses")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.abci.v1beta1.Abci.TxResponse>) {
      addAll(values)
    }/**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     * @param index The index to set the value at.
     * @param value The txResponses to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTxResponses")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.set(index: kotlin.Int, value: cosmos.base.abci.v1beta1.Abci.TxResponse) {
      _builder.setTxResponses(index, value)
    }/**
     * <pre>
     * tx_responses is the list of queried TxResponses.
     * </pre>
     *
     * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTxResponses")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.abci.v1beta1.Abci.TxResponse, TxResponsesProxy>.clear() {
      _builder.clearTxResponses()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse.copy(block: cosmos.tx.v1beta1.GetTxsEventResponseKt.Dsl.() -> Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxsEventResponse =
  cosmos.tx.v1beta1.GetTxsEventResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
