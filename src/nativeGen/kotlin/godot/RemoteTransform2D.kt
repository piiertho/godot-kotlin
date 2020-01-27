// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RemoteTransform2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getRemoteNode(): NodePath {
    val _ret = __method_bind.get_remote_node.call(this.toVariant())
    TODO()
  }

  fun getUpdatePosition(): Boolean {
    val _ret = __method_bind.get_update_position.call(this.toVariant())
    TODO()
  }

  fun getUpdateRotation(): Boolean {
    val _ret = __method_bind.get_update_rotation.call(this.toVariant())
    TODO()
  }

  fun getUpdateScale(): Boolean {
    val _ret = __method_bind.get_update_scale.call(this.toVariant())
    TODO()
  }

  fun getUseGlobalCoordinates(): Boolean {
    val _ret = __method_bind.get_use_global_coordinates.call(this.toVariant())
    TODO()
  }

  fun setRemoteNode(path: NodePath) {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.set_remote_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUpdatePosition(updateRemotePosition: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemotePosition)
    val _ret = __method_bind.set_update_position.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemoteRotation)
    val _ret = __method_bind.set_update_rotation.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUpdateScale(updateRemoteScale: Boolean) {
    val _args = VariantArray.new()
    _args.append(updateRemoteScale)
    val _ret = __method_bind.set_update_scale.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val _args = VariantArray.new()
    _args.append(useGlobalCoordinates)
    val _ret = __method_bind.set_use_global_coordinates.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): RemoteTransform2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RemoteTransform2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton RemoteTransform2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RemoteTransform2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RemoteTransform2D = RemoteTransform2D(ptr)
    /**
     * Container for method_bind pointers for RemoteTransform2D
     */
    private object __method_bind {
      val get_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remote_node" }
            }
          }

      val get_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_position" }
            }
          }

      val get_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_rotation" }
            }
          }

      val get_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_scale" }
            }
          }

      val get_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "get_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_global_coordinates" }
            }
          }

      val set_remote_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_remote_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_remote_node" }
            }
          }

      val set_update_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_position" }
            }
          }

      val set_update_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_rotation" }
            }
          }

      val set_update_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_update_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_scale" }
            }
          }

      val set_use_global_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RemoteTransform2D".cstr.ptr,
              "set_use_global_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_global_coordinates" }
            }
          }
    }
  }
}
