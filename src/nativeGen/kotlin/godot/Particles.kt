// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Particles internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun captureAabb(): AABB {
    val _ret = __method_bind.capture_aabb.call(this.toVariant())
    TODO()
  }

  fun getAmount(): Int {
    val _ret = __method_bind.get_amount.call(this.toVariant())
    TODO()
  }

  fun getDrawOrder(): DrawOrder {
    val _ret = __method_bind.get_draw_order.call(this.toVariant())
    TODO()
  }

  fun getDrawPassMesh(pass: Int): Mesh {
    val _args = VariantArray.new()
    _args.append(pass)
    val _ret = __method_bind.get_draw_pass_mesh.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getDrawPasses(): Int {
    val _ret = __method_bind.get_draw_passes.call(this.toVariant())
    TODO()
  }

  fun getExplosivenessRatio(): Float {
    val _ret = __method_bind.get_explosiveness_ratio.call(this.toVariant())
    TODO()
  }

  fun getFixedFps(): Int {
    val _ret = __method_bind.get_fixed_fps.call(this.toVariant())
    TODO()
  }

  fun getFractionalDelta(): Boolean {
    val _ret = __method_bind.get_fractional_delta.call(this.toVariant())
    TODO()
  }

  fun getLifetime(): Float {
    val _ret = __method_bind.get_lifetime.call(this.toVariant())
    TODO()
  }

  fun getOneShot(): Boolean {
    val _ret = __method_bind.get_one_shot.call(this.toVariant())
    TODO()
  }

  fun getPreProcessTime(): Float {
    val _ret = __method_bind.get_pre_process_time.call(this.toVariant())
    TODO()
  }

  fun getProcessMaterial(): Material {
    val _ret = __method_bind.get_process_material.call(this.toVariant())
    TODO()
  }

  fun getRandomnessRatio(): Float {
    val _ret = __method_bind.get_randomness_ratio.call(this.toVariant())
    TODO()
  }

  fun getSpeedScale(): Float {
    val _ret = __method_bind.get_speed_scale.call(this.toVariant())
    TODO()
  }

  fun getUseLocalCoordinates(): Boolean {
    val _ret = __method_bind.get_use_local_coordinates.call(this.toVariant())
    TODO()
  }

  fun getVisibilityAabb(): AABB {
    val _ret = __method_bind.get_visibility_aabb.call(this.toVariant())
    TODO()
  }

  fun isEmitting(): Boolean {
    val _ret = __method_bind.is_emitting.call(this.toVariant())
    TODO()
  }

  fun restart() {
    val _ret = __method_bind.restart.call(this.toVariant())
    TODO()
  }

  fun setAmount(amount: Int) {
    val _args = VariantArray.new()
    _args.append(amount)
    val _ret = __method_bind.set_amount.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDrawOrder(order: Int) {
    val _args = VariantArray.new()
    _args.append(order)
    val _ret = __method_bind.set_draw_order.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDrawPassMesh(pass: Int, mesh: Mesh) {
    val _args = VariantArray.new()
    _args.append(pass)
    _args.append(mesh)
    val _ret = __method_bind.set_draw_pass_mesh.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setDrawPasses(passes: Int) {
    val _args = VariantArray.new()
    _args.append(passes)
    val _ret = __method_bind.set_draw_passes.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setEmitting(emitting: Boolean) {
    val _args = VariantArray.new()
    _args.append(emitting)
    val _ret = __method_bind.set_emitting.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setExplosivenessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    val _ret = __method_bind.set_explosiveness_ratio.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFixedFps(fps: Int) {
    val _args = VariantArray.new()
    _args.append(fps)
    val _ret = __method_bind.set_fixed_fps.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFractionalDelta(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_fractional_delta.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLifetime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    val _ret = __method_bind.set_lifetime.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOneShot(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_one_shot.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPreProcessTime(secs: Float) {
    val _args = VariantArray.new()
    _args.append(secs)
    val _ret = __method_bind.set_pre_process_time.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessMaterial(material: Material) {
    val _args = VariantArray.new()
    _args.append(material)
    val _ret = __method_bind.set_process_material.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRandomnessRatio(ratio: Float) {
    val _args = VariantArray.new()
    _args.append(ratio)
    val _ret = __method_bind.set_randomness_ratio.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSpeedScale(scale: Float) {
    val _args = VariantArray.new()
    _args.append(scale)
    val _ret = __method_bind.set_speed_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_local_coordinates.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVisibilityAabb(aabb: AABB) {
    val _args = VariantArray.new()
    _args.append(aabb)
    val _ret = __method_bind.set_visibility_aabb.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1),

    DRAW_ORDER_VIEW_DEPTH(2);

    companion object {
      fun from(value: Int): DrawOrder {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val DRAW_ORDER_INDEX: Int = 0

    val DRAW_ORDER_LIFETIME: Int = 1

    val DRAW_ORDER_VIEW_DEPTH: Int = 2

    val MAX_DRAW_PASSES: Int = 4

    fun new(): Particles = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Particles" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Particles(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Particles = Particles(ptr)
    /**
     * Container for method_bind pointers for Particles
     */
    private object __method_bind {
      val capture_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "capture_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_aabb" }
            }
          }

      val get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_amount" }
            }
          }

      val get_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
            }
          }

      val get_draw_pass_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_draw_pass_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_pass_mesh" }
            }
          }

      val get_draw_passes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_draw_passes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_passes" }
            }
          }

      val get_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
            }
          }

      val get_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
            }
          }

      val get_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
            }
          }

      val get_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
            }
          }

      val get_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
            }
          }

      val get_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
            }
          }

      val get_process_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_material" }
            }
          }

      val get_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
            }
          }

      val get_visibility_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "get_visibility_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visibility_aabb" }
            }
          }

      val is_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "is_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emitting" }
            }
          }

      val restart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method restart" }
            }
          }

      val set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_amount" }
            }
          }

      val set_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
            }
          }

      val set_draw_pass_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_draw_pass_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_pass_mesh" }
            }
          }

      val set_draw_passes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_draw_passes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_passes" }
            }
          }

      val set_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emitting" }
            }
          }

      val set_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
            }
          }

      val set_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
            }
          }

      val set_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
            }
          }

      val set_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
            }
          }

      val set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val set_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
            }
          }

      val set_process_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_material" }
            }
          }

      val set_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
            }
          }

      val set_visibility_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles".cstr.ptr,
              "set_visibility_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility_aabb" }
            }
          }
    }
  }
}
