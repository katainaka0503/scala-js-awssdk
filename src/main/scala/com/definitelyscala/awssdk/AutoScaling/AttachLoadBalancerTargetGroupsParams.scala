package com.definitelyscala.awssdk.AutoScaling

import scala.scalajs.js

@js.native
trait AttachLoadBalancerTargetGroupsParams extends js.Object {
  var AutoScalingGroupName: String = js.native
  var TargetGroupARNs: js.Array[String] = js.native
}