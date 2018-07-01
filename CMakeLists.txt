cmake_minimum_required(VERSION 3.1.0)
project(libndt-java LANGUAGES CXX)
find_package(JNI REQUIRED)
# TODO(bassosimone): find libndt
set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
add_library(ndt-java SHARED src/main/cpp/libndt-java_wrap.cxx
            src/main/cpp/libndt-java_wrap.h)
target_include_directories(ndt-java PUBLIC ${JNI_INCLUDE_DIRS})
target_link_libraries(ndt-java ndt)
