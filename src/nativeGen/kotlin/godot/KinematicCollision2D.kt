// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class KinematicCollision2D(
  _handle: COpaquePointer
) : Reference(_handle) {
  val collider: Object
    get() {
       return getCollider() 
    }

  val colliderId: Int
    get() {
       return getColliderId() 
    }

  val colliderMetadata: Variant
    get() {
       return getColliderMetadata() 
    }

  val colliderShape: Object
    get() {
       return getColliderShape() 
    }

  val colliderShapeIndex: Int
    get() {
       return getColliderShapeIndex() 
    }

  val colliderVelocity: Vector2
    get() {
       return getColliderVelocity() 
    }

  val localShape: Object
    get() {
       return getLocalShape() 
    }

  val normal: Vector2
    get() {
       return getNormal() 
    }

  val position: Vector2
    get() {
       return getPosition() 
    }

  val remainder: Vector2
    get() {
       return getRemainder() 
    }

  val travel: Vector2
    get() {
       return getTravel() 
    }

  fun getCollider(): Object {
    val _ret = __method_bind.getCollider.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderId(): Int {
    val _ret = __method_bind.getColliderId.call(this._handle)
    return _ret.asInt()
  }

  fun getColliderMetadata(): Variant {
    val _ret = __method_bind.getColliderMetadata.call(this._handle)
    return _ret
  }

  fun getColliderShape(): Object {
    val _ret = __method_bind.getColliderShape.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getColliderShapeIndex(): Int {
    val _ret = __method_bind.getColliderShapeIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getColliderVelocity(): Vector2 {
    val _ret = __method_bind.getColliderVelocity.call(this._handle)
    return _ret.asVector2()
  }

  fun getLocalShape(): Object {
    val _ret = __method_bind.getLocalShape.call(this._handle)
    return _ret.asObject(::Object)!!
  }

  fun getNormal(): Vector2 {
    val _ret = __method_bind.getNormal.call(this._handle)
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.getPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getRemainder(): Vector2 {
    val _ret = __method_bind.getRemainder.call(this._handle)
    return _ret.asVector2()
  }

  fun getTravel(): Vector2 {
    val _ret = __method_bind.getTravel.call(this._handle)
    return _ret.asVector2()
  }

  companion object {
    fun new(): KinematicCollision2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicCollision2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicCollision2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicCollision2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicCollision2D = KinematicCollision2D(ptr)
    /**
     * Container for method_bind pointers for KinematicCollision2D
     */
    private object __method_bind {
      val getCollider: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider" }
        }
      val getColliderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_id" }
        }
      val getColliderMetadata: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider_metadata".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_metadata" }
        }
      val getColliderShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
        }
      val getColliderShapeIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider_shape_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_shape_index" }
        }
      val getColliderVelocity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_collider_velocity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_collider_velocity" }
        }
      val getLocalShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_local_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_local_shape" }
        }
      val getNormal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal" }
        }
      val getPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position" }
        }
      val getRemainder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_remainder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_remainder" }
        }
      val getTravel: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision2D".cstr.ptr,
            "get_travel".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_travel" }
        }}
  }
}
