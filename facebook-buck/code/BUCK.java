keystore(
  name = 'debug_keystore',
  store = 'debug.keystore',
  properties = 'debug.keystore.properties',
)

android_resource(
  name = 'res',
  res = 'src/main/res',
  package = 'com.facebook.shimmer.example',
  visibility = ['//shimmer-android-example:src'],
)

android_library(
  name = 'src',
  srcs = glob(['src/main/java/**/*.java']),
  deps = [
    ':res',
    '//shimmer-android:src',
  ],
)

android_binary(
  name = 'bin',
  manifest = 'src/main/AndroidManifest.xml',
  keystore = ':debug_keystore',
  deps = [
    ':res',
    ':src',
  ],
)

project_config(
  src_target = ':bin',
  src_roots = ['src/main/java'],
)