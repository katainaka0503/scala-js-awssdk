package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait TimerStartedEventAttributes extends js.Object {
  var timerId: String = js.native
  var control: String = js.native
  var startToFireTimeout: String = js.native
  var decisionTaskCompletedEventId: Double = js.native
}