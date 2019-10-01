drop table if exists gvs_hostel;

create table gvs_hostel (
    gvs_hostel_id serial primary key,
    gvs_hostel_date date not null,
    gvs_hostel_time time not null,
    gvs_hostel_gcal real not null,
    gvs_hostel_gcal_in real not null,
    gvs_hostel_gcal_out real not null,
    gvs_hostel_m3_in real not null,
    gvs_hostel_m3_out real not null,
    gvs_hostel_temperature varchar(10)
);

insert into gvs_hostel values (1, '2019-10-10', '12:33:21', 122.33, 7809, 6077, 22334, 21034, '56/52');
insert into gvs_hostel values (2, '2019-11-10', '11:24:13', 126.33, 7839, 6007, 22384, 21084, '56/52');