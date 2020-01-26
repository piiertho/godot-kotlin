// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MainLoop internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun finish() {
    TODO()
  }

  fun idle(delta: Float): Boolean {
    TODO()
  }

  fun init() {
    TODO()
  }

  fun inputEvent(event: InputEvent) {
    TODO()
  }

  fun inputText(text: String) {
    TODO()
  }

  fun iteration(delta: Float): Boolean {
    TODO()
  }

  companion object {
    val NOTIFICATION_CRASH: Int = 1012

    val NOTIFICATION_OS_IME_UPDATE: Int = 1013

    val NOTIFICATION_OS_MEMORY_WARNING: Int = 1009

    val NOTIFICATION_TRANSLATION_CHANGED: Int = 1010

    val NOTIFICATION_WM_ABOUT: Int = 1011

    val NOTIFICATION_WM_FOCUS_IN: Int = 1004

    val NOTIFICATION_WM_FOCUS_OUT: Int = 1005

    val NOTIFICATION_WM_GO_BACK_REQUEST: Int = 1007

    val NOTIFICATION_WM_MOUSE_ENTER: Int = 1002

    val NOTIFICATION_WM_MOUSE_EXIT: Int = 1003

    val NOTIFICATION_WM_QUIT_REQUEST: Int = 1006

    val NOTIFICATION_WM_UNFOCUS_REQUEST: Int = 1008

    fun new(): MainLoop = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MainLoop".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MainLoop" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MainLoop(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for MainLoop
     */
    private object __method_bind {
      val finish: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "finish".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method finish" }
            }
          }

      val idle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "idle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method idle" }
            }
          }

      val init: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "init".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method init" }
            }
          }

      val input_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "input_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method input_event" }
            }
          }

      val input_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "input_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method input_text" }
            }
          }

      val iteration: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MainLoop".cstr.ptr,
              "iteration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method iteration" }
            }
          }
    }
  }
}
