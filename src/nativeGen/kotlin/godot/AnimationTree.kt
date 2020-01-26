// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Transform
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationTree internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun clearCaches() {
    TODO()
  }

  fun nodeRemoved() {
    TODO()
  }

  fun treeChanged() {
    TODO()
  }

  fun updateProperties() {
    TODO()
  }

  fun advance() {
    TODO()
  }

  fun getAnimationPlayer(): NodePath {
    TODO()
  }

  fun getProcessMode(): AnimationTree.AnimationProcessMode {
    TODO()
  }

  fun getRootMotionTrack(): NodePath {
    TODO()
  }

  fun getRootMotionTransform(): Transform {
    TODO()
  }

  fun getTreeRoot(): AnimationNode {
    TODO()
  }

  fun isActive(): Boolean {
    TODO()
  }

  fun renameParameter() {
    TODO()
  }

  fun setActive() {
    TODO()
  }

  fun setAnimationPlayer() {
    TODO()
  }

  fun setProcessMode() {
    TODO()
  }

  fun setRootMotionTrack() {
    TODO()
  }

  fun setTreeRoot() {
    TODO()
  }

  enum class AnimationProcessMode(
    val value: Int
  ) {
    ANIMATION_PROCESS_PHYSICS(0),

    ANIMATION_PROCESS_IDLE(1),

    ANIMATION_PROCESS_MANUAL(2);
  }

  companion object {
    val ANIMATION_PROCESS_IDLE: Int = 1

    val ANIMATION_PROCESS_MANUAL: Int = 2

    val ANIMATION_PROCESS_PHYSICS: Int = 0

    fun new(): AnimationTree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationTree(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationTree
     */
    private object __method_bind {
      val _clear_caches: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "_clear_caches".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _clear_caches" }
            }
          }

      val _node_removed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "_node_removed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _node_removed" }
            }
          }

      val _tree_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "_tree_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_changed" }
            }
          }

      val _update_properties: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "_update_properties".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_properties" }
            }
          }

      val advance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "advance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method advance" }
            }
          }

      val get_animation_player: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_animation_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_player" }
            }
          }

      val get_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
            }
          }

      val get_root_motion_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_root_motion_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_motion_track" }
            }
          }

      val get_root_motion_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_root_motion_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root_motion_transform" }
            }
          }

      val get_tree_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "get_tree_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tree_root" }
            }
          }

      val is_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "is_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_active" }
            }
          }

      val rename_parameter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "rename_parameter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_parameter" }
            }
          }

      val set_active: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_active".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_active" }
            }
          }

      val set_animation_player: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_animation_player".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_player" }
            }
          }

      val set_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
            }
          }

      val set_root_motion_track: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_root_motion_track".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_root_motion_track" }
            }
          }

      val set_tree_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationTree".cstr.ptr,
              "set_tree_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tree_root" }
            }
          }
    }
  }
}
