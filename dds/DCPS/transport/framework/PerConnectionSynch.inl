// -*- C++ -*-
//
// $Id$

#include "EntryExit.h"

ACE_INLINE
OpenDDS::DCPS::PerConnectionSynch::PerConnectionSynch(
  ThreadSynchResource* synch_resource,
  long                 priority
)
  : ThreadSynch(synch_resource),
    condition_(this->lock_),
    work_available_(0),
    shutdown_(0),
    priority_( priority)
{
  DBG_ENTRY_LVL("PerConnectionSynch","PerConnectionSynch",6);
}

