// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.scalaland.chimney.examples.pb.order

@SerialVersionUID(0L)
final case class OrderLine(
    item: _root_.scala.Option[io.scalaland.chimney.examples.pb.order.Item] = _root_.scala.None,
    quantity: _root_.scala.Int = 0
    )