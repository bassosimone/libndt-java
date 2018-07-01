/* Part of Measurement Kit <https://measurement-kit.github.io/>.
   Measurement Kit is free software under the BSD license. See AUTHORS
   and LICENSE for more information on the copying conditions. */

/* SWIG interface file for libndt
   ============================== */

%module(directors="1") NdtLibrary

%{
#include <libndt.hpp>
%}

%include "stl.i"
%include "stdint.i"
%include "std_string.i"

%feature("director") Client;

/* Renamed symbols
   --------------- */

%rename("%(lowercamelcase)s", %$isfunction) "";
%rename("%(lowercamelcase)s", %$isvariable) "";
%rename("NdtClient") "Client";
%rename("NdtSettings") "Settings";

/* Ignored symbols
   --------------- */

%ignore Err;

%ignore nettest_flag_middlebox;
%ignore nettest_flag_simple_firewall;
%ignore nettest_flag_status;
%ignore nettest_flag_meta;
%ignore nettest_flag_upload_ext;

%ignore ndt_version_compat;

%ignore msg_comm_failure;
%ignore msg_srv_queue;
%ignore msg_login;
%ignore msg_test_prepare;
%ignore msg_test_start;
%ignore msg_test_msg;
%ignore msg_test_finalize;
%ignore msg_error;
%ignore msg_results;
%ignore msg_logout;
%ignore msg_waiting;
%ignore msg_extended_login;

%ignore libndt::Settings::metadata;

/* API extension
   ------------- */

%extend libndt::Settings {
  void add_metadata(std::string k, std::string v) {
    std::swap($self->metadata[k], v);
  }
}

/* SWIG-process the API header
   --------------------------- */

%include <libndt.hpp>
