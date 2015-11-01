create index IX_9348AE18 on release_dependency_management_Foo (field2);
create index IX_E057EA08 on release_dependency_management_Foo (uuid_);
create index IX_CF790520 on release_dependency_management_Foo (uuid_, companyId);
create unique index IX_F7C053A2 on release_dependency_management_Foo (uuid_, groupId);

create index IX_BEA998FD on release_dependency_management_Foo1 (field2);
create index IX_976B8E83 on release_dependency_management_Foo1 (uuid_);
create index IX_7ED155C5 on release_dependency_management_Foo1 (uuid_, companyId);
create unique index IX_F1CE8987 on release_dependency_management_Foo1 (uuid_, groupId);