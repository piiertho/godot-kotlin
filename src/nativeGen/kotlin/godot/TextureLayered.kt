// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureLayered internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getData(): Dictionary {
    TODO()
  }

  fun setData() {
    TODO()
  }

  fun create() {
    TODO()
  }

  fun getDepth(): Int {
    TODO()
  }

  fun getFlags(): Int {
    TODO()
  }

  fun getFormat(): Image.Format {
    TODO()
  }

  fun getHeight(): Int {
    TODO()
  }

  fun getLayerData(): Image {
    TODO()
  }

  fun getWidth(): Int {
    TODO()
  }

  fun setDataPartial() {
    TODO()
  }

  fun setFlags() {
    TODO()
  }

  fun setLayerData() {
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(4);
  }

  companion object {
    val FLAGS_DEFAULT: Int = 4

    val FLAG_FILTER: Int = 4

    val FLAG_MIPMAPS: Int = 1

    val FLAG_REPEAT: Int = 2

    /**
     * Container for method_bind pointers for TextureLayered
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

      val create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flags" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_layer_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_layer_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_data" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val set_data_partial: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_data_partial".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data_partial" }
            }
          }

      val set_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flags" }
            }
          }

      val set_layer_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_layer_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_data" }
            }
          }
    }
  }
}
